package com.caderneta.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.createam.heroku.https.HttpsEnforcer;

@Configuration
@ComponentScan(basePackages = "com.caderneta.config")
public class HttpsConfig {
	
	@Bean
	@ConditionalOnProperty(prefix = "heroku", name = "enforceHttps", havingValue = "true")
	public HttpsEnforcer httpsEnforcer() {
		return new HttpsEnforcer();
	}
}
