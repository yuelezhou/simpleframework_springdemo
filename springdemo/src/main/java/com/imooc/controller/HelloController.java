package com.imooc.controller;

import com.imooc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:58 2020-11-22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	public void handleRequest(){
		helloService.sayHello();
		helloService.justWantToThrowException();
	}
}
