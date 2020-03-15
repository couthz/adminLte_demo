package com.zhc.admin.dao;

import com.zhc.admin.model.Weblog;
import com.zhc.admin.model.WeblogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeblogMapper {
    int countByExample(WeblogExample example);

    int deleteByExample(WeblogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Weblog record);

    int insertSelective(Weblog record);

    List<Weblog> selectByExample(WeblogExample example);

    Weblog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Weblog record, @Param("example") WeblogExample example);

    int updateByExample(@Param("record") Weblog record, @Param("example") WeblogExample example);

    int updateByPrimaryKeySelective(Weblog record);

    int updateByPrimaryKey(Weblog record);
}