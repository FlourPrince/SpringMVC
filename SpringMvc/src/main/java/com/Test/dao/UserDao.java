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
	public User findByName(String name);
	
	/**
	 * 新增用户
	 * 
	 */
	public void insertUser(User user);
	
}
