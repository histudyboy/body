package com.bj.ict1.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bj.ict1.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class AccountTest {
	
	
	/**
	 * ע������࣬��Ϊ�������������ǿ
	 */
	@Resource(name="accountTransactionProxy")
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Test
	public void demoTest(){
		accountService.money(100,"����","����");
	}

}