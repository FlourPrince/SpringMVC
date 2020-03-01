package com.Test.daoImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Test.Tools.MySqlSessionTemplate;
import com.Test.dao.UserDao;
import com.Test.table.User;

@Repository("userDao")
public class UserDaoImpl extends  MySqlSessionTemplate  implements UserDao {
	@Override
	public List<User> findAll() {
		  List<User> lst=  getSqlSessionTemplate().selectList("com.Test.dao.UserDao.findAll");
		return lst;
	}

	@Override
	public User findByName(String name) {
		HashMap map=new HashMap<>();
		 map.put("username", name);
		User user=getSqlSessionTemplate().selectOne("com.Test.dao.UserDao.findByName", map);
		return user;
	}
	@Override
	public void insertUser(User user) {
		System.out.println(user);
		getSqlSessionTemplate().insert("com.Test.dao.UserDao.insertUser", user);
	}
}
