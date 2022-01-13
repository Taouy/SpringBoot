package com.example.springbootdemo.bean;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class Adve {

    private Integer id;
    private String title;
    private String pic;
    private String url;
    private String type;
    private Date beginTime;
    private Date endTime;
    private Integer allNum;
    private Integer clickNum;
    private Byte status;
    private Timestamp createTime;


}
