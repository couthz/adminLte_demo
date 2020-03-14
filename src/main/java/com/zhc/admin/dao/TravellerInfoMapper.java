package com.zhc.admin.dao;

import com.zhc.admin.model.TravellerInfo;
import com.zhc.admin.model.TravellerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravellerInfoMapper {
    int countByExample(TravellerInfoExample example);

    int deleteByExample(TravellerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TravellerInfo record);

    int insertSelective(TravellerInfo record);

    List<TravellerInfo> selectByExample(TravellerInfoExample example);

    TravellerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TravellerInfo record, @Param("example") TravellerInfoExample example);

    int updateByExample(@Param("record") TravellerInfo record, @Param("example") TravellerInfoExample example);

    int updateByPrimaryKeySelective(TravellerInfo record);

    int updateByPrimaryKey(TravellerInfo record);
}