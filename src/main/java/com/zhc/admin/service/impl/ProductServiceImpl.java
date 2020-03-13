package com.zhc.admin.service.impl;

import com.zhc.admin.dao.ProductDao;
import com.zhc.admin.model.ProductInfo;
import com.zhc.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<ProductInfo> findAll() throws Exception {
        return productDao.findAll();
    }
}
