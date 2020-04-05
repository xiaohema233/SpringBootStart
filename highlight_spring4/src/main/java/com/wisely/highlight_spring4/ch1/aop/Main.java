/**
 * 7-运行
 */
package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1 使用 AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfig.class);

		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

		demoAnnotationService.add();

		demoMethodService.add();

		context.close();
	}

}
