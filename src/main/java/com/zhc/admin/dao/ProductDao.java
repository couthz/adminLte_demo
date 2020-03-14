package com.zhc.admin.dao;

import com.zhc.admin.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductDao {

    List<ProductInfo> findAll() throws Exception;

    void save(ProductInfo productInfo);
}
