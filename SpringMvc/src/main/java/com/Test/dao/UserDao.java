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
	 //@Select("SELECT * FROM User ")
	List<User> findAll();
}
