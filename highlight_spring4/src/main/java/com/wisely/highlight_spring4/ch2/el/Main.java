package com.wisely.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//1 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ElConfig.class);
		//2 获取声明配置的 ElConfig 的Bean
		ElConfig resourceService = context.getBean(ElConfig.class);
		//3 调用 ElConfig 的 outputResource 方法
		resourceService.outputResource();

		context.close();
	}

}
