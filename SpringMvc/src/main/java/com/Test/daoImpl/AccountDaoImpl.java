package com.Test.daoImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Test.Tools.MySqlSessionTemplate;
import com.Test.dao.AccountDao;
import com.Test.table.Account;

@Repository
public class AccountDaoImpl extends MySqlSessionTemplate implements AccountDao {
	
	@Override
	public List<Account> findAll() {
		List<Account> lst =  getSqlSessionTemplate().selectList("com.Test.dao.AccountDao.findAllAccount") ;
		return lst;
	}
	@Override
	public Account findById(int id) {
		 HashMap map=new HashMap<>();
		 map.put("id", id);
		Account account =  getSqlSessionTemplate().selectOne("com.Test.dao.AccountDao.findAccountById",map) ;
		return account;
	}
	@Override
	public Account findByIdForUpdate(int id) {
		HashMap map=new HashMap<>();
		 map.put("id", id);
		Account account =  getSqlSessionTemplate().selectOne("com.Test.dao.AccountDao.findAccountByIdForUpdate",map) ;
		return account;
	}
	@Override
	public void insertAccount(Account account) {
		getSqlSessionTemplate().insert("com.Test.dao.AccountDao.insertAccount",account) ;
	}
	@Override
	public void deleteAccount(Account account) {
		getSqlSessionTemplate().delete("com.Test.dao.AccountDao.deleteAccount",account);
	}
	@Override
	public void updateAccount(Account account) {
		getSqlSessionTemplate().update("com.Test.dao.AccountDao.updateAccount",account);
	}

}
