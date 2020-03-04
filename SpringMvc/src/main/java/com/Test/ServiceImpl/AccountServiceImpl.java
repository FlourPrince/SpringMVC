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
	/* (non-Javadoc)
	 * @see com.Test.Service.AccountService#findById(int)
	 */
	@Override
	public Account findById(int id) {
		 return accountDao.findById(id);
	}
	/* (non-Javadoc)
	 * @see com.Test.Service.AccountService#findByIdForUpdate(int)
	 */
	@Override
	public Account findByIdForUpdate(int id) {
		return accountDao.findByIdForUpdate(id);
	}
	/* (non-Javadoc)
	 * @see com.Test.Service.AccountService#insertAccount(com.Test.table.Account)
	 */
	@Override
	public void insertAccount(Account account) {
		accountDao.insertAccount(account);
	}
	/* (non-Javadoc)
	 * @see com.Test.Service.AccountService#deleteAccount(com.Test.table.Account)
	 */
	@Override
	public void deleteAccount(Account account) {
		accountDao.deleteAccount(account);
	}
	/* (non-Javadoc)
	 * @see com.Test.Service.AccountService#updateAccount(com.Test.table.Account)
	 */
	@Override
	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}
}
