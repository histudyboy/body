package com.bj.ict2.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bj.ict2.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AccountTest {
	
	
	/**
	 * 注入代理类，因为代理类进行了增强
	 */
	@Resource(name="accountService")
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Test
	public void demoTest(){
		accountService.money(100,"张三","李四");
	}

}
