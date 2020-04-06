/**
 * 2-不同系统下Bean的类
 * Windows下所要创建的Bean的类
 */
package com.wisely.highlight_spring4.ch3.conditional;

public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}
