package com.zhc.admin.controller;

import com.github.pagehelper.PageInfo;
import com.zhc.admin.model.OrderInfo;
import com.zhc.admin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(required = true,defaultValue = "1") int page, @RequestParam(required = true,defaultValue = "4")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<OrderInfo> ordersList = orderService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("orders-list");
        return mv;
    }
}
