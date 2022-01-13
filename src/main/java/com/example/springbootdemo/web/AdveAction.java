package com.example.springbootdemo.web;


import com.example.springbootdemo.bean.Adve;
import com.example.springbootdemo.biz.AdveBiz;
import com.example.springbootdemo.dao.AdveDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class AdveAction {


    @Resource
    AdveDao adveDao;
    @Resource
    AdveBiz adveBiz;

    @GetMapping("toAdve")
    public ModelAndView toAdve(int id, ModelAndView mav) {
        Adve adve = adveBiz.queryNumAdve(id);
        mav.setViewName("redirect:http://" + adve.getUrl());
        return mav;


    }
}
