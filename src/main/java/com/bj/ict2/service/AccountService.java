package com.bj.ict2.service;

import org.springframework.stereotype.Service;

import com.bj.ict2.dao.AccountDao;


@Service
public class AccountService {
	private AccountDao accountDao;
	
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	/**
	 * 没有事务的管理方式
	 * @param in
	 * @param name1
	 * @param name2
	 */
	public void money(int in,String name1,String name2){
		accountDao.add(in,name1);
		int i = 1/0;
		accountDao.delete(in,name2);
	}
	
	

}
