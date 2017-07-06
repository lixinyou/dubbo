package com.java.dubbo.provider.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderBoot {

    public static void main(String[] args) {
        String cfgPath = "dubbo-provider.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfgPath);
        System.out.println("success!");
        while (true) {

        }
    }
}
