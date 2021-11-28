package top.ulane.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import wang.ulane.util.HttpUtil;

@Configuration
public class CustomBean {
	
	@Bean
	public HttpUtil httpUtil(){
		return new HttpUtil(60*1000);
	}
	
}
