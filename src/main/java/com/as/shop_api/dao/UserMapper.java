package com.as.shop_api.dao;

import com.as.shop_api.po.User;
import com.as.shop_api.tk.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper extends MyMapper<User> {
    @Select("select * from user")
    List<User> findAllUser();
}