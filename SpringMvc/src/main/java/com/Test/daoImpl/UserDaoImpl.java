package com.Test.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Test.Tools.MySqlSessionTemplate;
import com.Test.dao.UserDao;
import com.Test.table.User;

@Repository("userDao")
public class UserDaoImpl extends  MySqlSessionTemplate  implements UserDao {



	@Override
	public List<User> findAll() {
		
		
		  Map<String, Object> map=new HashMap<String, Object>();
		  map.put("xuhao", 2);
		 
		/*
		 * User user=new User(); user.setXuhao(1);
		 */
		  List<User> lst=  getSqlSessionTemplate().selectList("com.Test.dao.UserDao.findAll",map);
		 

		return lst;
	}
}
