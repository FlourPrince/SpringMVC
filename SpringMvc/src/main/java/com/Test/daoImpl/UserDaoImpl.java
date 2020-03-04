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
	public User findById(int id) {
		 HashMap map=new HashMap<>();
		 map.put("xuhao", id);
		User user=getSqlSessionTemplate().selectOne("com.Test.dao.UserDao.findById", map);
		return user;
	}


	@Override
	public User findByIdForUpdate(int id) {
		 HashMap map=new HashMap<>();
		 map.put("xuhao", id);
		User user=getSqlSessionTemplate().selectOne("com.Test.dao.UserDao.findByIdForUpdate", map);
		return user;
	}
	
	@Override
	public void insertUser(User user) {
		getSqlSessionTemplate().insert("com.Test.dao.UserDao.insertUser", user);
	}
	
	@Override
	public void deleteUser(User user) {
		getSqlSessionTemplate().delete("com.Test.dao.UserDao.deleteUser",user);
	}

	@Override
	public void updateUser(User user) {
		getSqlSessionTemplate().update("com.Test.dao.UserDao.updateUser",user);
	}


}
