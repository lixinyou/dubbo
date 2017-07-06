package com.java.dubbo.consumer.bootstrap;

import com.java.dubbo.consumer.reference.api.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerBoot {

    public static void main(String[] args) {
        String cfgPath = "dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfgPath);
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");
        String result = helloWorldService.sayHello();
        System.out.println(result);
    }
}
