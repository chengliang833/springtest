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
public class ControllerLogAspect extends LogAspect {
	
	@Around("execution(public * top.ulane.springtest.controller.*.*(..))")
	public Object controllerArount(ProceedingJoinPoint joinPoint) throws Throwable{
        return controllerAroundInvoke(joinPoint);
	}
	
}
