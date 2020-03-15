package com.zhc.admin.dao;

import com.zhc.admin.model.PermissionInfo;
import com.zhc.admin.model.PermissionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionInfoMapper {
    int countByExample(PermissionInfoExample example);

    int deleteByExample(PermissionInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionInfo record);

    int insertSelective(PermissionInfo record);

    List<PermissionInfo> selectByExample(PermissionInfoExample example);

    PermissionInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionInfo record, @Param("example") PermissionInfoExample example);

    int updateByExample(@Param("record") PermissionInfo record, @Param("example") PermissionInfoExample example);

    int updateByPrimaryKeySelective(PermissionInfo record);

    int updateByPrimaryKey(PermissionInfo record);
}