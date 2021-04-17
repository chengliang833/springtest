package top.ulane.springtest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import wang.ulane.log.LogAspect;

@Aspect
@Order(100)
@Component
public class ServiceLogAspect extends LogAspect{
	
	@Around("execution(public * top.ulane.springtest.service.impl.*.*(..))")
    public Object serviceAround(ProceedingJoinPoint joinPoint) throws Throwable {
		return serviceAroundInvoke(joinPoint);
    }
	
}
