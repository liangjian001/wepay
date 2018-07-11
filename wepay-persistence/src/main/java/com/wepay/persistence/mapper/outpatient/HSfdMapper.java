package com.wepay.persistence.mapper.outpatient;

import com.wepay.modle.entities.outpatient.HSfdEntity;
import com.wepay.modle.entities.outpatient.HSfdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSfdMapper {
    int countByExample(HSfdExample example);

    int deleteByExample(HSfdExample example);

    int deleteByPrimaryKey(String djh);

    int insert(HSfdEntity record);

    int insertSelective(HSfdEntity record);

    List<HSfdEntity> selectByExampleWithBLOBs(HSfdExample example);

    List<HSfdEntity> selectByExample(HSfdExample example);

    HSfdEntity selectByPrimaryKey(String djh);

    int updateByExampleSelective(@Param("record") HSfdEntity record, @Param("example") HSfdExample example);

    int updateByExampleWithBLOBs(@Param("record") HSfdEntity record, @Param("example") HSfdExample example);

    int updateByExample(@Param("record") HSfdEntity record, @Param("example") HSfdExample example);

    int updateByPrimaryKeySelective(HSfdEntity record);

    int updateByPrimaryKeyWithBLOBs(HSfdEntity record);

    int updateByPrimaryKey(HSfdEntity record);
}