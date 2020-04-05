/**
 * 3-事件发布类
 */
package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	//1 注入 ApplicationContext 用来发布事件。
	@Autowired
	ApplicationContext applicationContext;

	public void publish(String msg){
		//2 使用 ApplicationContext 的 publishEvent 方法来发布。
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
