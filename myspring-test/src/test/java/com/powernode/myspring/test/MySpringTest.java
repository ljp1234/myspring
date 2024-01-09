package com.powernode.myspring.test;

import com.powernode.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @author 鹏
 * @version 1.0
 * @description: TODO
 * @date 2024/1/9 18:05
 */
public class MySpringTest {

    @Test
    public void testMySpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        UserService userServiceBean = (UserService) applicationContext.getBean("userServiceBean");
        userServiceBean.save();
    }
}
