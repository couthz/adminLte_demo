package com.zhc.admin.service;

import com.zhc.admin.model.ProductInfo;

import java.util.List;

public interface productService {

    List<ProductInfo> findAll() throws Exception;
}
