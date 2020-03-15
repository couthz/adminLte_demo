package com.zhc.admin.service;

import com.zhc.admin.model.ProductInfo;
import com.zhc.admin.model.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void save(UserInfo userInfo);

    List<UserInfo> findAll() throws Exception;

    void login(String username, String password);
}
