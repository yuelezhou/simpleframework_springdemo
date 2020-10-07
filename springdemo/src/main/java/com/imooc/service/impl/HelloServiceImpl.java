package com.imooc.service.impl;

import com.imooc.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:54 2020-11-22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello everyBody");
	}

	@Override
	public void justWantToThrowException() {
		throw new RuntimeException("hello exception");
	}
}
