package com.ywp.test;


import com.ywp.services.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 测试Spring环境搭建
 */
public class TestSpring {

    @Test
    public void run(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

       //获取对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        //调用方法

        accountService.findAll();
    }


}
