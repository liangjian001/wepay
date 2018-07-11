package com.wepay.controller.outpatient;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wepay.business.outpatient.OutpatientOrderService;
import com.wepay.business.weixin.WeiXinPayService;
import com.wepay.modle.entities.outpatient.HSfdEntity;
import com.wepay.modle.entities.outpatient.HSfdExample;
import com.wepay.modle.entities.outpatient.HSfdExample.Criteria;
import com.wepay.modle.share.Product;
import com.wepay.modle.share.ResultInfo;
import com.wepay.utils.ConfigUtil;
import com.wepay.utils.HttpUtil;
import com.wepay.utils.PayCommonUtil;
import com.wepay.utils.XMLUtil;
import com.wepay.utils.common.AddressUtils;
import com.wepay.utils.common.DateUtil;
import com.wepay.utils.mobile.MobileUtil;

@RestController
@RequestMapping(value="/outpatient")
public class OutPatientOrderController {
	private static final Logger logger = LoggerFactory.getLogger(OutPatientOrderController.class);
	@Autowired
	private OutpatientOrderService outpatientOrderService;
	@Autowired
	private WeiXinPayService weiXinPayService;
	@Value("${server.context.url}")
	private String serverUrl;//项目地址

	/**
	 * 待支付门诊收费单列表页面
	 * @return
	 */
	@RequestMapping(value = "/orderListUI", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public ModelAndView orderListUI() {
		return new ModelAndView("outpatient/orderList");
	}
	
	/**
	 * 方法名可以和请求方式名称一致，例如可以替换成gets
	 * @return
	 */
	@RequestMapping(value = "/payUI/{djh}", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public ModelAndView payUI(@PathVariable("djh") String djh) {
		logger.info("开始为单据号："+ djh + "执行支付操作!");
		return new ModelAndView("outpatient/pay");
	}
	
	/**
	 * 方法名可以和请求方式名称一致，例如orderList可以替换成get
	 * 由于控制器类使用的是@RestController注解,其中含有@ResponseBody注解,结果index没有经过视图解析器解析，
	 * 直接变成json字符串返回给浏览器了，可以改变返回类型为ModelAndView，直接返回视图
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/orderList", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public List<HSfdEntity> getUserList() {
		List<HSfdEntity> list = new ArrayList<HSfdEntity>();
		HSfdExample example = new HSfdExample();
		ResultInfo resultInfo = outpatientOrderService.getOutpatientOrderList(example);
		if (resultInfo.getResultFlag()) {
			list = (List<HSfdEntity>) resultInfo.getResultObject();
			logger.info("查询到的数据条数：" + list.size());
		} else {
			logger.error("查询用户数据失败!");
		}
		return list;
	}

	@RequestMapping(value = "/patient/{sfzh}", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public Map<String ,Object> patient(@PathVariable("sfzh") String sfzh) {
		Map<String ,Object> info = new HashMap<String ,Object>();
		HSfdExample example = new HSfdExample();
		 Criteria criteria = example.or();
		 criteria = criteria.andDjhEqualTo("");
		ResultInfo resultInfo = outpatientOrderService.getOutpatientOrderList(example);
		resultInfo.setResultFlag(true);//方便测试
		if (resultInfo.getResultFlag()) {
			logger.info("查询到患者：");
			info.put("resultcode", "0");//返回结果标示 0 ：成功  1：失败
			info.put("resultmessage", "查询患者信息成功!");//返回结果提示
			info.put("name", "桃乐比");//患者姓名
			info.put("phone", "19900001111");//手机号码
			info.put("idnumber", "110234199001012345");//身份证号
			info.put("cardno", "121234567");
			info.put("address", "湖南省长沙市衡山县");
		} else {
			logger.error("查询患者信息失败!");
		}
		return info;
	}
	
	@RequestMapping("/pay")
    public void pay(Product product,ModelMap map,HttpServletResponse response) {
		logger.info("H5支付(需要公众号内支付)");
		try {
			String url = weiXinPayService.weiXinPayMobile(product);
			//return "redirect:"+url;
			response.sendRedirect(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	@RequestMapping("/h5pay")
    public String  h5pay(Product product,ModelMap map) {
		logger.info("纯H5支付(不建议在APP端使用)");
		//mweb_url为拉起微信支付收银台的中间页面，可通过访问该url来拉起微信客户端，完成支付,mweb_url的有效期为5分钟。
		String mweb_url = "";
		ResultInfo resultInfo = weiXinPayService.weiXinPayH5(product);
		if (null != resultInfo && resultInfo.getResultFlag()){
			mweb_url = resultInfo.getResultString();
		}
		if(StringUtils.isNotBlank(mweb_url)){
			return "redirect:"+mweb_url;
		}else{
			return "redirect:https://blog.52itstyle.com";//自定义错误页面
		}
    }
	
	/**
	 * 预下单(对于已经产生的订单)
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "dopay")
	public String dopay(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String state = request.getParameter("state");
		String[] split = state.split("/");
		String orderNo = split[0];
		String totalFee = split[1];
		//获取code 这个在微信支付调用时会自动加上这个参数 无须设置
		String code = request.getParameter("code");
		//获取用户openID(JSAPI支付必须传openid)
		String openId = MobileUtil.getOpenId(code);
		String notify_url =serverUrl+"/outpatient/WXPayBack";//回调接口
		String trade_type = "JSAPI";// 交易类型H5支付
		SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
		ConfigUtil.commonParams(packageParams);
		packageParams.put("body","门诊就诊费用");//商品描述
		packageParams.put("out_trade_no", orderNo);//商户订单号
		packageParams.put("total_fee", totalFee);//总金额
		packageParams.put("spbill_create_ip", AddressUtils.getIpAddr(request));//发起人IP地址
		packageParams.put("notify_url", notify_url);//回调地址
		packageParams.put("trade_type", trade_type);//交易类型
		packageParams.put("openid", openId);//用户openID
		String sign = PayCommonUtil.createSign("UTF-8", packageParams,ConfigUtil.API_KEY);
		packageParams.put("sign", sign);// 签名
		String requestXML = PayCommonUtil.getRequestXml(packageParams);
		String resXml = HttpUtil.postData(ConfigUtil.UNIFIED_ORDER_URL, requestXML);
		Map<String, String> map = XMLUtil.doXMLParse(resXml);
		String returnCode = (String) map.get("return_code");
		String returnMsg = (String) map.get("return_msg");
		StringBuffer url = new StringBuffer();
		if("SUCCESS".equals(returnCode)){
			String resultCode = (String) map.get("result_code");
			String errCodeDes = (String) map.get("err_code_des");
			if("SUCCESS".equals(resultCode)){
				//获取预支付交易会话标识
				String prepay_id = (String) map.get("prepay_id");
				String prepay_id2 = "prepay_id=" + prepay_id;
				String packages = prepay_id2;
				SortedMap<Object, Object> finalpackage = new TreeMap<Object, Object>();
				String timestamp = DateUtil.getTimestamp();
				String nonceStr = packageParams.get("nonce_str").toString();
				finalpackage.put("appId",  ConfigUtil.APP_ID);
				finalpackage.put("timeStamp", timestamp);
				finalpackage.put("nonceStr", nonceStr);
				finalpackage.put("package", packages);  
				finalpackage.put("signType", "MD5");
				//这里很重要  参数一定要正确 狗日的腾讯 参数到这里就成大写了
				//可能报错信息(支付验证签名失败 get_brand_wcpay_request:fail)
				sign = PayCommonUtil.createSign("UTF-8", finalpackage,ConfigUtil.API_KEY);
				url.append("redirect:/outpatient/pay?");
				url.append("timeStamp="+timestamp+"&nonceStr=" + nonceStr + "&package=" + packages);
				url.append("&signType=MD5" + "&paySign=" + sign+"&appid="+ ConfigUtil.APP_ID);
				url.append("&orderNo="+orderNo+"&totalFee="+totalFee);
			}else{
				logger.info("订单号:{}错误信息:{}",orderNo,errCodeDes);
				url.append("redirect:/outpatient/error?code=0&orderNo="+orderNo);//该订单已支付
			}
		}else{
			logger.info("订单号:{}错误信息:{}",orderNo,returnMsg);
			url.append("redirect:/outpatient/error?code=1&orderNo="+orderNo);//系统错误
		}
		return url.toString();
	}
	
	@RequestMapping(value = "WXPayBack")
	public void WXPayBack(HttpServletRequest request, HttpServletResponse response){
		String resXml = "";
		try {
			//解析XML
			Map<String, String> map = MobileUtil.parseXml(request);
	        String return_code = map.get("return_code");//状态
	        String out_trade_no = map.get("out_trade_no");//订单号
			if (return_code.equals("SUCCESS")) {
				if (out_trade_no != null) {
					//处理订单逻辑
					logger.info("微信手机支付回调成功订单号:{}",out_trade_no);
					resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>" + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
				}
			}else{
				logger.info("微信手机支付回调失败订单号:{}",out_trade_no);
				resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
			}
		} catch (Exception e) {
			logger.error("手机支付回调通知失败",e);
			 resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
		}
		try {
			// ------------------------------
			// 处理业务完毕
			// ------------------------------
			BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
			out.write(resXml.getBytes());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	//itemsView/{id}里边的{id}表示占位符，通过@PathVariable获取占位符中的参数，
	//@PathVariable中名称要和占位符一致，形参名无需和其一致
	//如果占位符中的名称和形参名一致，在@PathVariable可以不指定名称
	@RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public ResponseEntity<ResultInfo> getUserDetailInfo(@PathVariable("userId") String userId) {
		System.out.println(">>>开始获取ID为:" + userId + "的用户详细信息......");
		ResultInfo resultInfo = sysUserService.getUserListByEntity(entity);
		if (!resultInfo.getResultFlag()) {
			System.out.println("User with id " + userId + " not found");
			return new ResponseEntity<ResultInfo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ResultInfo>(resultInfo, HttpStatus.OK);
	}*/

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public String updateUser() {
		return "";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
	}
}