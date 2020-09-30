package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:02 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello("来自Controller的问候");
	}

}
