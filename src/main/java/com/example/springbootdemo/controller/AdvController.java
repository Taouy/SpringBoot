package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Adve;
import com.example.springbootdemo.biz.AdveBiz;
import com.example.springbootdemo.dao.AdveDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author Taouy
 * @Description
 * @date 2021/11/22 17:30
 */
@RestController
public class AdvController {

    @Resource
    private AdveBiz adveBiz;

    @RequestMapping("toAdve")
    public ModelAndView toAdve(int id,ModelAndView mav){
        Adve adve = adveBiz.queryNumAdve(id);
        mav.setViewName("redirect://" + adve.getUrl());
        return mav;
    }

}
