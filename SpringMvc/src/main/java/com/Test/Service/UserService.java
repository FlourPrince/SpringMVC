package com.Test.Service;

import com.Test.table.User;

import java.util.List;

public interface UserService {
	public   List<User> findAll();
    
    public User findByName(String name);
	
	public void insertUser(User user);
}
