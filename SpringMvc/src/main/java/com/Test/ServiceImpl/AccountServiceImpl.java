package com.Test.ServiceImpl;


import com.Test.dao.AccountDao;
import com.Test.dao.UserDao;
import com.Test.table.Account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.Service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
   private AccountDao accountDao;
	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}
}
