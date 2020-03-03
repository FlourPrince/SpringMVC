 package com.Test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Test.Service.UserService;
import com.Test.dao.UserDao;
import com.Test.table.User;
@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService {
     @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
    	
        return userDao.findAll();
    }
	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}
	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
    @Override
    public  void tranferUser(User user ,User user2) {
    	 
    	  userDao.insertUser(user);
                 
    	int i=1/0;
    	
    	  userDao.insertUser(user);
    }
}
