package com.wepay.business.weixin;

import com.wepay.modle.share.Product;
import com.wepay.modle.share.ResultInfo;

public interface WeiXinPayService {
	/**
	 * 微信支付下单(模式二)
	 * 扫码支付 还有模式一 适合固定商品ID
	 * @param product
	 * @return
	 */
	ResultInfo weiXinPay(Product product);
	
	/**
	 * 微信支付退款
	 * @param product
	 * @return
	 */
	ResultInfo weiXinPayRefund(Product product);
	
	/**
	 * 微信支付-关闭订单
	 * @param product
	 * @return
	 */
	ResultInfo weiXinPayCloseOrder(Product product);
	
	/**
	 * 下载并保存微信订单
	 * @return
	 */
	ResultInfo downloadWeiXinOrders();
	
	/**
	 * 微信手机支付返回一个url地址
	 * @param product
	 * @return
	 */
	String weiXinPayMobile(Product product);
	
	/**
	 * H5支付 唤醒 微信APP 进行支付
	 * @param product
	 * @return
	 */
	ResultInfo weiXinPayH5(Product product);
}
