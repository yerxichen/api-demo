package com.sjq.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sjq.demo.entity.CpuEntity;
import com.sjq.demo.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
@DS("master_1")
public interface UserMapper extends BaseMapper<UserEntity> {

    @Select("select * from t_user ")
    @Results(value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "sex", property = "showSex", jdbcType = JdbcType.VARCHAR, one = @One(select = "com.sjq.demo.mapper.UserMapper.getXb"))
    })
    List<Map<String, String>> getUserList();


    /**
     * 分页查询（详细查看对应的service实现）
     * @return
     */
    @Select("select * from t_user ")
    List<Map<String, String>> getUserByPage();

    @Select("select zdmc from t_dic where zdlbdm='ZDY_XB' and zddm=#{sex}")
    String getXb();




    /**
     * 动态sql
     * @param bs
     * @return
     */
    @SelectProvider(type = BuildUserSql.class,method = "getUserListWhereSql")
    @Results(value = {
            @Result(column = "sex", property = "showSex", jdbcType = JdbcType.VARCHAR, one = @One(select = "com.sjq.demo.mapper.UserMapper.getXb"))
    })
    List<Map<String, String>> getUserListWhere(@Param("bs") String bs);


    class BuildUserSql{
        public String getUserListWhereSql(String bs){
            return new SQL(){{
                SELECT("*");
                FROM("t_user");
                WHERE("sex=#{bs}");

            }}.toString();
        }
    }
}
