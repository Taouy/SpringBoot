package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author Taouy
 * @Description
 * @date 2021/11/23 11:19
 */
public interface UserDao {


    @Insert("insert into hyfc_user values(default,#{name},#{pwd},#{email},#{head},#{phone},default,#{level})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")      //自动递增
    void insert(User user);

    @Select("select count(*) from hyfc_user where name = #{name}")
    int countByName(String name);
}
