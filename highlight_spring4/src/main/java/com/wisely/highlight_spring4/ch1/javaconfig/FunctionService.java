/**
 * 1-编写功能类的Bean
 */
package com.wisely.highlight_spring4.ch1.javaconfig;
//1 此处没有@Service 声明Bean
public class FunctionService {
	
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}

}
