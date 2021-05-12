package com.as.shop_api.tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: shop_api
 * @description: ${description}
 * @author: liujiang
 * @create: 2021-05-12 11:12
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
