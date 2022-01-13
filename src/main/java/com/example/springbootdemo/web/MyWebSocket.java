package com.example.springbootdemo.web;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Hashtable;

@Component
//自定义连接地址
@ServerEndpoint("/ws/{id}") //地址参数 id  客户端的唯一标识
public class MyWebSocket {


    // Hashtable用来存放每个客户端对应的id : session对象。
    private static Hashtable<String, Session> webSocketMap = new Hashtable<>();

    //连接建立成功调用的方法
    @OnOpen
    public void onOpen(@PathParam("id") String id, Session session) {

    }

    //连接关闭调用的方法
    @OnClose
    public void onclose(Session session) {
    }

    //收到客户端消息后调用的方法
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {


    }
}

