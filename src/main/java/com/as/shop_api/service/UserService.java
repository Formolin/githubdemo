package com.as.shop_api.service;

import com.as.shop_api.po.User;

import java.util.List;

/**
 * @program: shop_api
 * @description: ${description}
 * @author: liujiang
 * @create: 2021-05-12 12:41
 **/
public interface UserService {
    List<User> findAllUser();
}
