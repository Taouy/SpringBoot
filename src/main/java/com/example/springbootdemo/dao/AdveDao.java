package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.Adve;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AdveDao {

    @Select("select * from hyfc_adve where status=1 limit 0,5")
    List<Adve> selectTop5();


    @Select("update hyfc_adve set\n" +
            "status=\n" +
            "case\n" +
            "when status=0 then (case when begin_time < now() then 1 else status  end)\n" +
            "when status=1 then (case when end_time < now() then 2 else status  end)\n" +
            "end\n" +
            "where status =0 or status=1 and type =1")
void updateAdveStatus();

    @Select("select * from hyfc_adve where id =#{id}")
    Adve selectById(int id);

    @Update("update hyfc_adve set " +
            "click_num = click_num + 1," +
            "status = case when all_num <= click_num then 2 else status end " +
            "where id =#{id}"
    )
    void updateAdveNumStatus(int id);
}
