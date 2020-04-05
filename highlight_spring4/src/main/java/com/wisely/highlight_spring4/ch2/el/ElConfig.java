package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:test.properties")//7 注入配置文件 需使用 @PropertySource 指定文件地址
public class ElConfig {

	@Value("I Love You!") //1 注入普通字符串
    private String normal;

	@Value("#{systemProperties['os.name']}") //2 注入操作系统属性
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }") //3 注入表达式结果
    private double randomNumber;

	@Value("#{demoService.another}") //4 注入其他Bean属性
	private String fromAnother;

	@Value("classpath:test.txt") //5 注入文件资源
	private Resource testFile;

	@Value("http://www.baidu.com") //6 注入网址资源
	private Resource testUrl;

	@Value("${book.name}") //7 注入配置文件
	private String bookName;

	@Autowired
	private Environment environment; //7 注入的 Properties 还可以从 Environment 中获得
	
	@Bean //7 若使用@Value注入 需配置一个 PropertySourcesPlaceholderConfigurer 的Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	


	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println("test file:"+IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
