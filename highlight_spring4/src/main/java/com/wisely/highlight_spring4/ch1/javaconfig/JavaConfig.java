/**
 * 3-配置类
 */
package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//1 使用@Configuration 注解表明当前类是一个配置类
@Configuration
public class JavaConfig {
	//2 使用@Bean 注解声明当前方法返回值是一个Bean，Bean的名称是方法名。
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		//3 注入 FunctionService 的 Bean 时候直接调用 functionService()
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;

	}

//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService){//4
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
}
