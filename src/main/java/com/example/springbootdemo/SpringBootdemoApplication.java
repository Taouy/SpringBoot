package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


@SpringBootApplication
@MapperScan("com.example.springbootdemo.dao")
@EnableScheduling
public class SpringBootdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootdemoApplication.class, args);
    }

    @Bean("helloMsg")
    public String helloMsg() {
        return "你好中国";

    }


   // 定义服务器端管理器Bean
//    @Bean
//    public ServerEndpointExporter serverEndpointExporter() {  
//
//        return new ServerEndpointExporter();
//    }

}
