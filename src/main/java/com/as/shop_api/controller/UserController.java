package com.as.shop_api.controller;

import com.as.shop_api.po.User;
import com.as.shop_api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shop_api
 * @description: ${description}
 * @author: liujiang
 * @create: 2021-05-12 08:56
 **/
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getMsg")
    public String getMsg() {
        return "hello world";
    }
    @RequestMapping("/users")
    public List<User> getAllUser() {
        List<User> list = userService.findAllUser();
        return list;
    }
}
