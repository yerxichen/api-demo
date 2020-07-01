package com.sjq.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sjq.demo.entity.PermissionEntity;
import com.sjq.demo.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
@DS("master_1")
public interface PermissionMapper extends BaseMapper<PermissionEntity> {


}
