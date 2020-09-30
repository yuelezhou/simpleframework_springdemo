package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:24 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
//实例工厂调用
public class UserFactory {
	//普通的方法，返回User对象
	//不能通过类名调用，需要通过对象调用
	public User getUser(){
		return new User();
	}
}
