package com.Test.dao;


import com.Test.table.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
  /**
     * 查询所有
   * 
   */
	public List<User> findAll();
	/**
	 * 
         * 根据用户名查询用户
	 */
	public User findById(int id);
	/**
	 * 解锁查询
	 * 
	 */
	public User findByIdForUpdate(int id);
	/**
	 * 新增用户
	 * 
	 */
	public void insertUser(User user);
	/**
	 * 注销客户
	 * 
	 */
	public void deleteUser(User user);
	/**
	 * 更新客户信息
	 */
	public void updateUser(User user);
	/**
	 * 加锁更新客户信息
	 */
	public void updateUserForUpdate(User user);
}
