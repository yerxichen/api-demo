package com.sjq.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sjq.demo.entity.RolePermissionEntity;
import com.sjq.demo.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@DS("master_1")
public interface RolePermissionMapper extends BaseMapper<RolePermissionEntity> {


}
