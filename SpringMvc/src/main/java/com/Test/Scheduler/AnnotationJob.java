package com.Test.Scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.Test.Service.AccountService;
import com.Test.table.Account;

@Component
public class AnnotationJob {
     @Autowired
	 private AccountService accountService;
	@Scheduled(cron = "0/1 * * * * ?")
	public void schedulerJob() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("AnnotationJob 开始调度，当前时间：" + format.format(new Date()));
	 Account account=	accountService.findById(1);
		System.out.println(account);
	}
	
	
	

}
