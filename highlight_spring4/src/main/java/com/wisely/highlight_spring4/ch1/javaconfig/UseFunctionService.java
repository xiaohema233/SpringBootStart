/**
 * 2-使用功能类的Bean
 */
package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;
//1 此处没有使用@Service 声明Bean
public class UseFunctionService {
	//2 此处没有使用@Autowired 注解注入 Bean
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}

}
