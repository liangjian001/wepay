package com.wepay.persistence.dao.outpatient;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wepay.modle.entities.outpatient.HSfdEntity;
import com.wepay.modle.entities.outpatient.HSfdExample;
import com.wepay.persistence.mapper.outpatient.HSfdMapper;

@Repository
public class OutpatientOrderDao {
	/**
	 * 获取门诊收费单列表
	 * @param sqlSession
	 * @param example
	 * @return
	 */
	public List<HSfdEntity> getOutpatientOrderList(SqlSession sqlSession, HSfdExample example) {
		HSfdMapper mapper = sqlSession.getMapper(HSfdMapper.class);
		return mapper.selectByExample(example);
	}
	
	/**
	 * 查询符合条件的记录数
	 * @param sqlSession
	 * @param example
	 * @return
	 */
	public int getOutpatientOrderCount(SqlSession sqlSession, HSfdExample example) {
		HSfdMapper mapper = sqlSession.getMapper(HSfdMapper.class);
		return mapper.countByExample(example);
	}
	
	/**
	 * 更新门诊收费单相关信息
	 * @param sqlSession
	 * @param record
	 * @param example
	 * @return
	 */
	public int updateOutpatientOrderInfo(SqlSession sqlSession, HSfdEntity record, HSfdExample example) {
		HSfdMapper mapper = sqlSession.getMapper(HSfdMapper.class);
		return mapper.updateByExample(record, example);
	}
}
