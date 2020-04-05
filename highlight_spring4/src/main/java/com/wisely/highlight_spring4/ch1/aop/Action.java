/**
 * 1-pom.xml引入依赖
 * 2-编写拦截规则的注解
 * 注解本身没有功能，是一种元数据，即解释数据的数据，也就是所谓配置。
 */
package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
