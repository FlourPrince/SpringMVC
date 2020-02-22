package com.Test.ServiceImpl;


import com.Test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.Service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
  //private UserDao userDao;
/*    @Override
    public Account findAccountById() {
       userDao.findAll();
        System.out.println("findAccountById");
        return null;
    }*/

    @Override
    public void saveAccount() {

        System.out.println("saveAccount");
    }
}
