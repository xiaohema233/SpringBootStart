package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(DiConfig.class);

		//2 获取声明配置的UseFunctionService的Bean
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.SayHello("world"));
		 
		context.close();
	}
}
