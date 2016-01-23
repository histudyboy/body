package com.bj.ict.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.bj.ict.dao.AccountDao;


@Service
public class AccountService {
	private AccountDao accountDao;
	
	private TransactionTemplate transactionTemplate;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	/**
	 * 没有事务的管理方式
	 * @param in
	 * @param name1
	 * @param name2
	 */
	public void money(int in,String name1,String name2){
		accountDao.add(in,name1);
		//int i = 1/0;
		accountDao.delete(in,name2);
	}
	
	/**
	 * 通过编程式来管理事务
	 * @param in
	 * @param name1
	 * @param name2
	 */
	public void money1(int in,String name1,String name2){
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				accountDao.add(in,name1);
				//int i = 1/0;
				accountDao.delete(in,name2);				
			}
		});
		
	}

}
