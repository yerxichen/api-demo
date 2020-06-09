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
     * @param userId
     * @return
     */
    List<String> getRoleByUserId(String userId);

    /**
     * 根据用户id查询权限
     * @param userId
     * @return
     */
    List<String> getPermissionByUserId(String userId);
}
