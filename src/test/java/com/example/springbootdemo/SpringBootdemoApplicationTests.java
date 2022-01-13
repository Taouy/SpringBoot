package com.example.springbootdemo;

import com.example.springbootdemo.dao.HallDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootdemoApplicationTests {

    @Resource
    private HallDao hallDao;

    @Test
    void contextLoads() {
        System.out.println(hallDao.selectCount());
    }

}
