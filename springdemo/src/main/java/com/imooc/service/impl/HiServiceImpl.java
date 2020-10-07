package com.imooc.service.impl;

import com.imooc.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:57 2020-11-22
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Service
public class HiServiceImpl implements HiService {
	@Override
	public void sayHi() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hi everyone");
	}

	@Override
	public String justWantToSayHi() {
		return "just want to say Hi";
	}
}
