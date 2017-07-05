package com.example.config;

import javax.sql.DataSource;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);
        registry.addViewController("/").setViewName("welcome");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);		
	}
	
//	@Bean
//	public StandardPasswordEncoder passwordEncoder()
//	{
//		StandardPasswordEncoder spe=new StandardPasswordEncoder();
//		return spe;
//	}
//	
//	@Bean
//	public DataSource datasource()
//	{
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost/test");
//		ds.setUsername("root");
//		ds.setPassword("Vineeth248170");
//		
//		return ds;
//	}
	
	
	

}
