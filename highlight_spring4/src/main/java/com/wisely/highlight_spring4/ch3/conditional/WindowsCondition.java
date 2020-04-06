/**
 * 1-判定条件定义
 * 判定Windows的条件
 */
package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext context,
            AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }

}