package com.zhc.admin.service;

import com.zhc.admin.model.OrderInfo;

import java.util.List;

public interface OrderService {
    List<OrderInfo> findAll(int page, int size) throws Exception ;
}
