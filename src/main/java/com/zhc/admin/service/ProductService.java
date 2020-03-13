package com.zhc.admin.service;

import com.zhc.admin.model.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findAll() throws Exception;
}
