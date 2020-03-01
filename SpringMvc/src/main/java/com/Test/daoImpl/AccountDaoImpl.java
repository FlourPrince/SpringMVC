package com.Test.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Test.Tools.MySqlSessionTemplate;
import com.Test.dao.AccountDao;
import com.Test.table.Account;

@Repository
public class AccountDaoImpl extends MySqlSessionTemplate implements AccountDao {
	
	@Override
	public List<Account> findAll() {
		List<Account> lst =  getSqlSessionTemplate().selectList("com.Test.dao.AccountDao.findAll") ;
		return lst;
	}

}
