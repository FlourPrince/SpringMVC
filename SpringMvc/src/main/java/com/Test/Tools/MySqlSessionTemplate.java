package com.Test.Tools;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

/**
 *     
 * @author lenovo
 *
 */

public  class MySqlSessionTemplate implements ApplicationContextAware {

	private SqlSessionTemplate template;

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		if (template == null) {
			template = arg0.getBean(SqlSessionTemplate.class);
		}

	}
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return template;
	}

}
