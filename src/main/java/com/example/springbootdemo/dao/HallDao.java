package com.example.springbootdemo.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Repository
public interface HallDao {

    @Select("select count(*) from hall")
    public long selectCount();

}
