package com.bj.ict3.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bj.ict3.dao.AccountDao;

//propagation :����ĸ�����Ϊ
//isolation   :����ĸ��뼶��
//readOnly    ���Ƿ�Ϊֻ��
//rollbackFor �������쳣�ع�
//noRollbackFor��������Щ�쳣���ع�
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false,rollbackFor={},noRollbackFor={})
public class AccountService {
	private AccountDao accountDao;
	
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	/**
	 * û������Ĺ���ʽ
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
