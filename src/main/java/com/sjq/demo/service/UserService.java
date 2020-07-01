package com.sjq.demo.service;

import com.github.pagehelper.PageInfo;
import com.sjq.demo.Utils.PageResult;
import com.sjq.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List getUserList();
    List getUserListWhere(String bs);

    PageResult getUserByPage(int page, int size);

    UserEntity getUserByNameAndPassword(String name,String password);

    UserEntity getUserById(int id);
    UserEntity getUserByName(String name);
}
