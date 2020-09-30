package com.imooc;

import com.imooc.controller.WelcomeController;
import com.imooc.entity.User;
import com.imooc.entity.factory.UserFactoryBean;
import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 10:29 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Configuration
@ComponentScan("com.imooc")
public class Entrance {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		String xmlPath = "//Users/zhoule/gitlibrary/spring-framework-5.1.x/springdemo/src/main/resources/spring/spring-config" +
				".xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的Spring框架");


		//6-2
		//得到无参构造函数创建的对象
		User user1a = (User)applicationContext.getBean("user1");
		User user1b = (User)applicationContext.getBean("user1");
		//得到静态工厂创建的对象
		User user2a = (User)applicationContext.getBean("user2");
		User user2c = (User)applicationContext.getBean("user2");
		//得到实例工厂创建的对象：
		User user3a = (User)applicationContext.getBean("user3");
		User user3b = (User)applicationContext.getBean("user3");

		//实现FactoryBean接口的类
		User user4a = (User)applicationContext.getBean("userFactoryBean"); //自动调用了getObject方法
		User user4b = (User)applicationContext.getBean("userFactoryBean");

		//获取FactoryBean工厂 '&'的使用
		FactoryBean userFactoryBean = (UserFactoryBean)applicationContext.getBean("&userFactoryBean");
		User user4c =(User)userFactoryBean.getObject();

		System.out.println("无参构造函数创建的对象：" + user1a);
		System.out.println("无参构造函数创建的对象：" + user1b);
		System.out.println("静态工厂创建的对象：" + user2a);
		System.out.println("静态工厂创建的对象：" + user2c);
		System.out.println("实例工厂创建的对象：" + user3a);
		System.out.println("实例工厂创建的对象：" + user3b);
		System.out.println("FactoryBean接口实现创建的对象：" + user4a);
		System.out.println("FactoryBean接口实现创建的对象：" + user4b);
		System.out.println("FactoryBean接口实现类 获取工厂Bean：" + userFactoryBean);
		System.out.println("FactoryBean实例getObject方法返回的对象：" + user4c);



	}

	public static void main2(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames){
			System.out.println(beanDefinitionName);
		}
		WelcomeController welcomeController = (WelcomeController)applicationContext.getBean("welcomeController");
		welcomeController.handleRequest();
	}
}
