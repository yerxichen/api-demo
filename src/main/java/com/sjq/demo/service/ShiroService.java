package com.sjq.demo.service;

import com.sjq.demo.entity.PermissionEntity;
import com.sjq.demo.entity.RoleEntity;
import com.sjq.demo.entity.RolePermissionEntity;
import com.sjq.demo.entity.UserRoleEntity;

import java.util.List;

/**
 * 权限管理
 */
public interface ShiroService {

    /**
     * 根据用户id查询角色
     * @param id
     * @return
     */
    List<String> getRoleByUserId(int id);

    /**
     * 根据用户id查询权限
     * @param id
     * @return
     */
    List<String> getPermissionByUserId(int id);
}
