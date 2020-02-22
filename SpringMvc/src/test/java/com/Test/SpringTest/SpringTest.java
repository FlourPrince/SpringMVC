package com.Test.SpringTest;

import com.Test.Service.AccountService;
import com.Test.Service.UserService;
import com.Test.dao.UserDao;
import com.Test.table.Account;
import com.Test.table.User;

import java.util.List;

import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Test.Tools.*;

public class SpringTest {
      /**
                   * 测试 SpringIOC依赖注入  mybatis用法
       * @Author pansw
       *         <p>
       *         <li>2020年2月19日-下午1:22:23</li>
       *         <li>功能说明：使用list的循环</li>
       *         </p>
       */
      @Test
    public void  Test(){
          ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
          UserService userService = ac.getBean("userService", UserService.class);
          List<User> lst = userService.findAll();
          System.out.println(lst);
          
      }
      @Test
      public void test1() {
    	  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    	  SqlSessionTemplate sqlSessionTemplate=ac.getBean(SqlSessionTemplate.class);
    	  
    	  List<User> lst =     sqlSessionTemplate.selectList("com.Test.dao.UserDao.findAll");
    	  
    	  System.out.println(lst);
      }
      @Test
      public void test2() {
    	  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    	  UserDao  userDao=  ac.getBean(UserDao.class);
    	  List<User> lst = userDao.findAll();
    	  System.out.println(lst);
      }



}
