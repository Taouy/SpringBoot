package com.example.springbootdemo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BbsDao {

    @Select("select * from hyfc_bbs order by id desc limit 0,16")
    List<Map<?, ?>> bbsTop();

    @Select("select * from hyfc_bbs where id=#{id}")
    Map<?, ?> bbsById(Integer id);
}
