package com.sjq.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjq.demo.Utils.PageResult;
import com.sjq.demo.entity.UserEntity;
import com.sjq.demo.mapper.UserMapper;
import com.sjq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List getUserListWhere(String bs) {
        return userMapper.getUserListWhere(bs);
    }

    @Override
    public PageResult getUserByPage(int page, int size) {
        PageHelper.startPage(page,size);
        List<Map<String,String>> userList=userMapper.getUserByPage();
        return PageResult.getPageResult(new PageInfo<>(userList));
    }

    @Override
    public UserEntity getUserByNameAndPassword(String name, String password) {
        return userMapper.selectOne(new QueryWrapper<UserEntity>().eq("name",name).eq("password",password));
    }

    @Override
    public UserEntity getUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public UserEntity getUserByName(String name) {
        return userMapper.selectOne(new QueryWrapper<UserEntity>().eq("name",name));
    }


}
