package com.Test.Tools;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class MySqlSessionTemplate {
	private SqlSessionTemplate template ;
	public SqlSessionTemplate getSqlSessionTemplate() {
		return template;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate template) {
		this.setSqlSessionTemplate(template);
	}
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		if(template==null) {
			template=createSqlSessionTemplate(sqlSessionFactory);
		}
	}
	
	public SqlSessionTemplate createSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}
