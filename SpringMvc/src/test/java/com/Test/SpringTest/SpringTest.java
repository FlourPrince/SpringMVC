package com.Test.SpringTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Test.Service.AccountService;
import com.Test.Service.UserService;
import com.Test.dao.UserDao;
import com.Test.table.Account;
import com.Test.table.User;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring.xml"})
public class SpringTest {
      /**
                   * 测试 SpringIOC依赖注入  mybatis用法
       * @Author pansw
       *         <p>
       *         <li>2020年2月19日-下午1:22:23</li>
       *         <li>功能说明：使用list的循环</li>
       *         </p>
       */
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao  userDao;
	@Autowired
	private AccountService accountService;
      /**
       * 测试sqlSessionTemplate
       * @Author pansw
       *         <p>
       *         <li>2020年2月22日-下午8:57:45</li>
       *         <li>功能说明：使用list的循环</li>
       *         </p>
       */
      @Test
      public void test1() {
    	  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    	  SqlSessionTemplate sqlSessionTemplate=ac.getBean(SqlSessionTemplate.class);
    	  
    	  List<User> lst =     sqlSessionTemplate.selectList("com.Test.dao.UserDao.findAll");
    	  
    	  System.out.println(lst);
      }
      @Test
      public void test2() {
    	  List<User> lst = userDao.findAll();
    	  System.out.println(lst);
      }

      @Test
      public void  Test3(){
  		/*
  		 * ApplicationContext ac = new
  		 * ClassPathXmlApplicationContext("applicationContext.xml"); UserService
  		 * userService = ac.getBean("userService", UserService.class);
  		 */
            List<User> lst = userService.findAll();
            System.out.println(lst);
        }
      @Test
      public void  Test4(){
            List<Account> lst = accountService.findAll();
            System.out.println(lst);
            
            List<User> lst1 = userService.findAll();
            System.out.println(lst1);
        }
      @Test
      public void test5() {
    	  //根据用户名查询用户
    	  User user =userService.findByName("李四");
    	  System.out.println(user.toString());
      }
      @Test
      public void test6(){
    	  //新增用户
    	  User user =new User();
    	  user.setXuhao(4);
    	  user.setUsername("刘六");
    	  user.setPassword("123");
    	  userService.insertUser(user);
                 
    	  int i=1/0;
    	  user.setXuhao(5);
    	  user.setUsername("刘7");
    	  user.setPassword("123");
    	  userService.insertUser(user);
    	  
      }
}
