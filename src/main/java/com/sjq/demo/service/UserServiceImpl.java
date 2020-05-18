package com.sjq.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjq.demo.Utils.PageResult;
import com.sjq.demo.mapper.UserMapper;
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
    public List getUserListWhere(int bs) {
        return userMapper.getUserListWhere(bs);
    }

    @Override
    public PageResult getUserByPage(int page, int size) {
        PageHelper.startPage(page,size);
        List<Map<String,String>> userList=userMapper.getUserByPage();
        return PageResult.getPageResult(new PageInfo<>(userList));
    }


}
