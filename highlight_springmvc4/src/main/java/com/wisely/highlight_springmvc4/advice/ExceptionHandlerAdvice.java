package com.wisely.highlight_springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //1 声明一个控制器建言 @ControllerAdvice 组合了@Component 所以会自动注册为Spring的Bean
public class ExceptionHandlerAdvice { 

	@ExceptionHandler(value = Exception.class)//2
	public ModelAndView exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error");// error页面
		modelAndView.addObject("errorMessage", exception.getMessage());
		return modelAndView;
	}

	@ModelAttribute //3 将键值对添加到全局 所有注解的@RequestMapping方法可获得此键值对
	public void addAttributes(Model model) {
		model.addAttribute("msg", "额外信息"); //3
	}

	@InitBinder //4 定制WebDataBinder
	public void initBinder(WebDataBinder webDataBinder) {
		//5 忽略request参数的id
//		webDataBinder.setDisallowedFields("id");
	}
}
