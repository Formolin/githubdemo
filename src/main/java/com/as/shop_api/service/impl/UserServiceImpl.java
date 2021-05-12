package com.as.shop_api.service.impl;

import com.as.shop_api.dao.UserMapper;
import com.as.shop_api.po.User;
import com.as.shop_api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shop_api
 * @description: ${description}
 * @author: liujiang
 * @create: 2021-05-12 12:42
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
