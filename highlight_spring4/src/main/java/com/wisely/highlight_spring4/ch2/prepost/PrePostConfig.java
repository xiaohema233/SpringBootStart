package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="destroy") //1 initMethod destroyMethod 指定类的init和destroy方法在构造之后、Bean销毁之前执行。
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}

}
