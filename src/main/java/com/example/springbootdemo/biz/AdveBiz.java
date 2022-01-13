package com.example.springbootdemo.biz;

import com.example.springbootdemo.bean.Adve;
import com.example.springbootdemo.dao.AdveDao;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Service
public class AdveBiz {
    @Resource
    AdveDao adveDao;

    //    没30秒更新广告专题
    @Scheduled(cron = "* * 0/30 * * ?")
    public void autoUpdateAdveStatue() {
        System.out.println("==========================");
        adveDao.updateAdveStatus();


    }

    //更新计量广告
    public Adve queryNumAdve(int id) {
        Adve adve = adveDao.selectById(id);

        //点击量+1
        adveDao.updateAdveNumStatus(id);
        return adve;
    }
}
