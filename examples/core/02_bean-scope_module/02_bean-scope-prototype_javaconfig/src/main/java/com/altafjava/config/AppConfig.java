package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.altafjava.bean.MyBean;

@Configuration
public class AppConfig {

	@Bean
	@Scope(scopeName = "prototype")
	public MyBean myBean() {
		return new MyBean();
	}

}
