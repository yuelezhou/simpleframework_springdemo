package com.imooc.controller;

import com.imooc.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 16:01 2020-11-22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Controller
public class HiController {
	@Autowired
	private HiService hiService;

	public void handleRequest(){
		hiService.sayHi();
		hiService.justWantToSayHi();
	}
}
