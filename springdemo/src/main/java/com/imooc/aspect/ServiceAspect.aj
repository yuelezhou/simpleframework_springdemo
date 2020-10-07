package com.imooc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 16:03 2020-11-22
 * @ Description：
 * @ Modified By：
 * @ Version:     
 */
@Aspect
@Component
public class ServiceAspect {
    @Pointcut()
    public void  embed(){}
}
