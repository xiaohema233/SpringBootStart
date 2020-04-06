package com.wisely.highlight_spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AwareConfig.class);
		//2 获取声明配置的 AwareService 的Bean
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		
		context.close();
	}
}
