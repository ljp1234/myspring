package com.powernode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 然后我们解析beans.xml文件创建applicationContext（容器），该容器中包含所有配置在beans.xml文件中的对象。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 然后通过对应bean的唯一标识，即id，来获取对应实例对象。
        Object userBean = applicationContext.getBean("userBean");
    }
}
