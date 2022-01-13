package com.example.springbootdemo.web;


import com.example.springbootdemo.dao.AdveDao;
import com.example.springbootdemo.dao.BbsDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class IndexAction {


    @Resource
    BbsDao bbsDao;
    @Resource
    AdveDao adveDao;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("blist", bbsDao.bbsTop());
        model.addAttribute("alist", adveDao.selectTop5());

        return "index";
    }

    @GetMapping("/bbsShow")
    public String bbsShow(Model model, int id) {
        System.out.println(id);
        model.addAttribute("bbsOne", bbsDao.bbsById(id));
        return "bbs_show";
    }
}
