package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:02 2020-09-26
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Controller
public class WelcomeController implements ApplicationContextAware, BeanNameAware {

	private String myName;

	private ApplicationContext myContainer;

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello("来自Controller的问候");
		System.out.println("我是" + myName);
		//7-2
		String[] beanDefinitionNames = myContainer.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames){
			System.out.println("通过实现Aware获得容器的BeanDefinitionName:" + beanDefinitionName);
		}
	}

	/**
	 * Set the name of the bean in the bean factory that created this bean.
	 * <p>Invoked after population of normal bean properties but before an
	 * init callback such as {@link InitializingBean#afterPropertiesSet()}
	 * or a custom init-method.
	 *
	 * @param name the name of the bean in the factory.
	 *             Note that this name is the actual bean name used in the factory, which may
	 *             differ from the originally specified name: in particular for inner bean
	 *             names, the actual bean name might have been made unique through appending
	 *             "#..." suffixes. Use the {@link BeanFactoryUtils#originalBeanName(String)}
	 *             method to extract the original bean name (without suffix), if desired.
	 */
	@Override
	public void setBeanName(String name) {
		//7-2
		this.myName = name;
	}

	/**
	 * Set the ApplicationContext that this object runs in.
	 * Normally this call will be used to initialize the object.
	 * <p>Invoked after population of normal bean properties but before an init callback such
	 * as {@link InitializingBean#afterPropertiesSet()}
	 * or a custom init-method. Invoked after {@link ResourceLoaderAware#setResourceLoader},
	 * {@link ApplicationEventPublisherAware#setApplicationEventPublisher} and
	 * {@link MessageSourceAware}, if applicable.
	 *
	 * @param applicationContext the ApplicationContext object to be used by this object
	 * @throws ApplicationContextException in case of context initialization errors
	 * @throws BeansException              if thrown by application context methods
	 * @see BeanInitializationException
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//7-2
		this.myContainer = applicationContext;
	}
}
