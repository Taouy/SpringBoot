package com.example.springbootdemo.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

/**
 * @author Taouy
 * @Description
 * @date 2021/11/23 11:18
 */
@Data
public class User {
    private Integer  id;
    @NotEmpty(message = "账号不能为空")
    @Length(min = 2,max = 20,message = "账号长度必须是2~20个字符")
    private String  name;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,max = 16,message = "账号长度必须是6~16个字符")
    private String  pwd;
    @Email
    private String  email;
    private String  head;
    private String  phone;
    private Timestamp intime;
    private Integer  level;
}
