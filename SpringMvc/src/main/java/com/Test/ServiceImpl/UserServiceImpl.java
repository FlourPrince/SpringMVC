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
    	
    	
        System.out.println("UserServiceImpl+++++++++");
        return userDao.findAll();
    }
    /**
              * 注册账号
     */
    
}
