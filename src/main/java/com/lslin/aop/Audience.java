package com.lslin.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* com.lslin.service.impl.UserServiceImpl.getUserById(..))")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		System.out.println("aop before");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("aop after");
	}

}
