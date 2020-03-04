package com.Test.Service;


import java.util.List;

import com.Test.table.Account;

public interface AccountService {
	/**
     * 查询所有
   * 
   */
	public List<Account> findAll();
	/**
	 * 
         * 根据用户名查询用户
	 */
	public Account findById(int id);
	/**
	 * 解锁查询
	 * 
	 */
	public Account findByIdForUpdate(int id);
	/**
	 * 新增用户
	 * 
	 */
	public void insertAccount(Account account);
	/**
	 * 注销客户
	 * 
	 */
	public void deleteAccount(Account account);
	/**
	 * 更新客户信息
	 */
	public void updateAccount(Account account);

}
