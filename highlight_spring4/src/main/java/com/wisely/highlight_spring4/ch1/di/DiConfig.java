/**
 * 3-配置类
 */
package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //1 声明当前类是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di") //2 自动扫描包下所有使用@Service @Component @Repository @Controller的类，并注册为Bean
public class DiConfig {

}
