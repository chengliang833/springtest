package top.ulane.springtest.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(100)
@Component
public class BeanTestAspect {
	
	@Around("execution(public * top.ulane.springtest.aop.test.BeanTest.*(..))")
	public Object controllerArount(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("in...");
		Object result = joinPoint.proceed();
		System.out.println("out...");
        return result;
	}
	
}
