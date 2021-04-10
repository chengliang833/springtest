package top.ulane.springtest.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Aspect
@Order(100)
@Component
public class ServiceLogAspect extends LogAspect{
	
	@Around("execution(public * top.ulane.springtest.service.impl.*.*(..))")
    public Object serviceAround(ProceedingJoinPoint joinPoint) throws Throwable {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	    Method method = signature.getMethod();
	    Class<?> targetClass = method.getDeclaringClass();
	    String target = targetClass.getName() + ":" + method.getName();
		Object[] args = joinPoint.getArgs();
		
		long start = System.currentTimeMillis();
		
		printLogBeforeProceed(target, JSONObject.toJSONString(args));
		
		Object result = joinPoint.proceed();
		long timeConsuming = System.currentTimeMillis() - start;
		printObjectLogAfterProceed(target, timeConsuming, result);
		
		return result;
    }
	
}
