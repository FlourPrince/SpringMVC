package com.Test.MybatisTest;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Test.Components.Deposit;
import com.Test.Service.AccountService;
import com.Test.Service.UserService;
import com.Test.dao.AccountDao;
import com.Test.dao.UserDao;
import com.Test.table.Account;
import com.Test.table.User;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring.xml"})
public class MybatisTest {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao  userDao;
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private Deposit deposit;
	
	@Test 
	public void test1() {
		User user1=new User();
		user1.setXuhao(1);
		User user2=new User();
		user2.setXuhao(2);
		BigDecimal money= new BigDecimal(1000);
		deposit.deposit(user1, user2,money);
		
		
	}
}
