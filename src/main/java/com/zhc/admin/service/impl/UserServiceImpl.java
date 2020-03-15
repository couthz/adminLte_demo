package com.zhc.admin.service.impl;

import com.zhc.admin.dao.UserInfoMapper;
import com.zhc.admin.model.RoleInfo;
import com.zhc.admin.model.UserInfo;
import com.zhc.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService,UserDetailsService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(UserInfo userInfo) {
        /*密码加密*/
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userInfoMapper.insert(userInfo);

    }

    @Override
    public List<UserInfo> findAll() throws Exception {
        return userInfoMapper.findAll();
    }

    @Override
    public void login(String username, String password){
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo  userInfo = userInfoMapper.findByUsername(username);
        //处理自己的用户对象封装成UserDetails
        User user=new User(userInfo.getUsername(),
                userInfo.getPassword(),
                userInfo.getStatus()==0 ? false : true,
                true,
                true,
                true,
                getAuthority(userInfo.getRoles()));
        return user;
    }

    private List<SimpleGrantedAuthority> getAuthority(List<RoleInfo> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for(RoleInfo roleInfo: roles){
            list.add(new SimpleGrantedAuthority(roleInfo.getRoleName()));
        }
        return list;
    }
}
