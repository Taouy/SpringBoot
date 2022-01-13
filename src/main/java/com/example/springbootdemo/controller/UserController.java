                                                                                                        package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.biz.BizException;
import com.example.springbootdemo.biz.UserBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;


import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * @author Taouy
 * @Description
 * @date 2021/11/23 11:46
 */

@Controller
public class UserController {

    @Resource
    private UserBiz userBiz;
    // 表单提交方式实现注册  VS AJax提交方式
    public  String reg(@Valid User user, Errors errors, Model model){
        try {
            userBiz.reg(user,errors);
        } catch (BizException e) {
            e.printStackTrace();
            model.addAttribute("errors",e.getMessage());
        }

        return "reg";
    }
}
