package com.Test.controller;

import com.Test.Service.UserService;
import com.Test.table.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Test.Service.AccountService;

import java.util.List;


@Controller
@RequestMapping("/HelloController")
public class HelloController {
	  @Autowired
      private UserService userService;
	@RequestMapping(path="/sayhello")
  public String sayhello(){
		System.out.println("HelloController++++++");

		List<User> userList=userService.findAll();
System.out.println(userList.toString());

		return "success";
	}


}
