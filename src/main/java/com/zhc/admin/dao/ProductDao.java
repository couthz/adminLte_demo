package com.zhc.admin.dao;

import com.zhc.admin.model.ProductInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select * from product")
    List<ProductInfo> findAll() throws Exception;
}
