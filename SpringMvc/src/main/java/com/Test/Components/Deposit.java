package com.Test.Components;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Test.Service.AccountService;
import com.Test.table.Account;
import com.Test.table.User;

@Component("deposit")
public class Deposit {

	@Autowired
	private  AccountService accountService;
	public  void deposit(User user,User user2,BigDecimal money) {
		
		Account account =  accountService.findById(user.getXuhao());
		account.setMoney(account.getMoney().add(money));
		accountService.updateAccount(account);
		 account =  accountService.findById(user2.getXuhao());
		account.setMoney(account.getMoney().add(money));
		accountService.updateAccount(account);
		
		
	}
	
	
	
}
