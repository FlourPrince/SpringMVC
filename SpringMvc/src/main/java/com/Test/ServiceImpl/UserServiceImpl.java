package com.Test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.Service.UserService;
import com.Test.dao.UserDao;
import com.Test.table.User;
@Service("userService")
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
    
    
}
