package com.bj.ict3.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bj.ict3.dao.AccountDao;

//propagation :事务的隔离行为
//isolation   :事务的隔离级别
//readOnly    ：是否为只读
//rollbackFor ：发生异常回滚
//noRollbackFor：发生哪些异常不回滚
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false,rollbackFor={},noRollbackFor={})
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
		//int i = 1/0;
		accountDao.delete(in,name2);
	}
	
	

}
