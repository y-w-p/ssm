package com.ywp.test;

import com.ywp.dao.AccountDao;
import com.ywp.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试mybatis环境搭建
 */
public class TestMybatis {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run() throws Exception{

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");


        //创建SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //创建SqlSession对象
        SqlSession session = factory.openSession();

        //获取代理对象
        AccountDao dao= session.getMapper(AccountDao.class);

        //调用方法
        List<Account> list = dao.findAll();
        for(Account account: list){
            System.out.println(account);
        }

        //关闭资源
        session.close();
        in.close();
    }


    /**
        * 测试保存
        * @throws Exception
        */
       @Test
       public void run1() throws Exception{
           Account account = new Account();
           account.setName("测试保存");
           account.setMoney(600d);

           //加载配置文件
           InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");


           //创建SqlSessionFactory工厂对象
           SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

           //创建SqlSession对象
           SqlSession session = factory.openSession();

           //获取代理对象
           AccountDao dao= session.getMapper(AccountDao.class);

           //保存
          dao.saveAccount(account);

          //提交事务
           session.commit();

           //关闭资源
           session.close();
           in.close();
       }



}
