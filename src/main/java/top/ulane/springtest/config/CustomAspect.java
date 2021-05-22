package top.ulane.springtest.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import wang.ulane.log.LogAspect;

@Aspect
public class CustomAspect extends LogAspect{

	@Around("execution(public * top.ulane.springtest.util.*.*(..))")
	public Object customAround(ProceedingJoinPoint joinPoint) throws Throwable{
        return aroundInvoke(joinPoint, false);
	}
	
}
