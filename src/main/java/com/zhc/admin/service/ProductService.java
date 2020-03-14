package com.zhc.admin.service;

import com.zhc.admin.model.ProductInfo;

import java.util.List;

public interface ProductService {

    void save(ProductInfo productInfo);

    List<ProductInfo> findAll() throws Exception;
}
