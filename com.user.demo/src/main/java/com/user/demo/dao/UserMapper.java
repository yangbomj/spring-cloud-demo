package com.user.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.user.demo.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
