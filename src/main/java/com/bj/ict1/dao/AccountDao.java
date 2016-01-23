package com.bj.ict1.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao  extends JdbcDaoSupport {
	
	
	
	public void add(int out,String name){
		String sql = "update SPRING_STUDY a set a.money = a.money - ? where name = ?";
		this.getJdbcTemplate().update(sql,out,name);
		
	}
	public void delete(int in,String name){
		String sql = "update SPRING_STUDY a set a.money = a.money + ? where name = ?";
		this.getJdbcTemplate().update(sql,in,name);
	}

}
