package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:21 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public class StaticFactory {

	public static User getUser(){
		return new User();
	}
}
