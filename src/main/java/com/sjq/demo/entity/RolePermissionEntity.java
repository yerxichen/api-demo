package com.sjq.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role_permission")
public class RolePermissionEntity {

    private String role;
    private String permission;
}
