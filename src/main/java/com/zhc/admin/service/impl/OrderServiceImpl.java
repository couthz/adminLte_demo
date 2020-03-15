package com.zhc.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhc.admin.dao.OrderInfoMapper;
import com.zhc.admin.model.OrderInfo;
import com.zhc.admin.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> findAll(int page, int size) throws Exception {
        PageHelper.startPage(page,size);
        return orderInfoMapper.findAll();
    }
}
