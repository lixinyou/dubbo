package com.java.dubbo.provider.service.impl;


import com.java.dubbo.provider.api.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

    public String sayHello() {
        return "hello world!";
    }
}
