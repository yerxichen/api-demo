package com.sjq.demo.service;

import com.github.pagehelper.PageInfo;
import com.sjq.demo.Utils.PageResult;

import java.util.List;
import java.util.Map;

public interface UserService {

    List getUserList();
    List getUserListWhere(String bs);

    PageResult getUserByPage(int page, int size);
}
