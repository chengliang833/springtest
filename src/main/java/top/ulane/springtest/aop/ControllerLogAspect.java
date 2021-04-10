package top.ulane.springtest.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Aspect
@Order(100)
@Component
public class ControllerLogAspect extends LogAspect {
	
	@Around("execution(public * top.ulane.springtest.controller.*.*(..))")
	public Object controllerArount(ProceedingJoinPoint joinPoint) throws Throwable{
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Class<?> targetClass = method.getDeclaringClass();

        Object[] args = joinPoint.getArgs();
        
        String target = targetClass.getName() + ":" + method.getName();
        String params = JSONObject.toJSONString(args);

//        HttpServletRequest request =  ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//        log.info("sessionid:"+request.getSession().getId());
        
        printLogBeforeProceed(target, params);

        long start = System.currentTimeMillis();
		Object result = joinPoint.proceed();
        long timeConsuming = System.currentTimeMillis() - start;

        if(result instanceof ModelAndView || (result instanceof ResponseEntity && ((ResponseEntity)result).getBody() instanceof InputStreamResource)){
        	printStreamLogAfterProceed(target, timeConsuming, result);
        }else{
        	printObjectLogAfterProceed(target, timeConsuming, result);
        }
        return result;
	}
	
}
