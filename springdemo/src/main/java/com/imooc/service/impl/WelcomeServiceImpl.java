package com.imooc.service.impl;

import com.imooc.service.WelcomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 10:35 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
