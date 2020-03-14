package com.zhc.admin.controller;

import com.zhc.admin.model.ProductInfo;
import com.zhc.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/save.do")
    public String save(ProductInfo productInfo){
        productService.save(productInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<ProductInfo> ps = productService.findAll();
        mv.addObject("productList",ps);
        mv.setViewName("productlist");
        return mv;
    }
}
