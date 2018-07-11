package com.wepay.business.outpatient.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wepay.business.outpatient.OutpatientOrderService;
import com.wepay.modle.entities.outpatient.HSfdEntity;
import com.wepay.modle.entities.outpatient.HSfdExample;
import com.wepay.modle.share.ResultInfo;
import com.wepay.persistence.dao.outpatient.OutpatientOrderDao;
import com.wepay.persistence.dbutils.MybatisSqlSessionFactory;

@Service("outpatientOrderService")
public class OutpatientOrderServiceImpl implements OutpatientOrderService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OutpatientOrderDao outpatientOrderDao;
	
	/**
	 * 获取门诊收费单列表
	 */
	@Override
	public ResultInfo getOutpatientOrderList(HSfdExample example) {
		ResultInfo resultInfo = new ResultInfo();
		SqlSession sqlSession  = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			List<HSfdEntity> listData = new ArrayList<HSfdEntity>();
			listData = outpatientOrderDao.getOutpatientOrderList(sqlSession, example);
			if (null != listData && 0 < listData.size()){
				resultInfo.setResultFlag(true);
				resultInfo.setResultObject(listData);
			} else {
				resultInfo.setResultFlag(false);
				resultInfo.setResultText("没有查询到符合条件的数据!");
			}
		} catch (Exception ex){
			ex.printStackTrace();
			resultInfo.setResultFlag(false);
			resultInfo.setResultText("查询数据异常!");
		} finally {
			sqlSession.close();
		}
		return resultInfo;
	}

	/**
	 * 查询符合条件的记录数
	 */
	@Override
	public int getOutpatientOrderCount(HSfdExample example) {
		SqlSession sqlSession  = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
		int count = 0;
		try {
			count = outpatientOrderDao.getOutpatientOrderCount(sqlSession, example);
		} catch (Exception ex){
			ex.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return count;
	}

	/**
	 * 更新门诊收费单相关信息
	 */
	@Override
	public ResultInfo updateOutpatientOrderInfo(HSfdEntity record, HSfdExample example) {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setResultFlag(false);
		SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			int nums = outpatientOrderDao.updateOutpatientOrderInfo(sqlSession, record, example);
			if (0 < nums){
				resultInfo.setResultFlag(true);
				resultInfo.setResultText("更新门诊收费单数据成功!");
				sqlSession.commit();
			}
			else{
				resultInfo.setResultText("更新门诊收费单数据失败!");
				sqlSession.rollback();
			}
		} catch (Exception ex){
			ex.printStackTrace();
			sqlSession.rollback();
			resultInfo.setResultText("更新门诊收费单数据异常!");
		} finally {
			sqlSession.close();
		}
		return resultInfo;
	}

}
