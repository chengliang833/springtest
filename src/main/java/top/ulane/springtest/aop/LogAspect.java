package top.ulane.springtest.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

public class LogAspect {
	
	protected static Logger log = LoggerFactory.getLogger(LogAspect.class);

    protected void printLogBeforeProceed(String target, String params){
    	log.info("开始{}调用--> {} 参数:{}", Thread.currentThread().getName(), target, params);
    }
    
    protected void printStreamLogAfterProceed(String target, long timeConsuming, Object result){
    	log.info("调用{}结束<-- {} 返回值:{} 耗时:{}ms", Thread.currentThread().getName(), target, "InputStreamResource 不打印", timeConsuming);
    }
    
    protected void printObjectLogAfterProceed(String target, long timeConsuming, Object result){
        //返回值太多了，需要看再打印，如果为空是空字符串
    	String resultStr = JSONObject.toJSONString(result);
    	if(resultStr.length() > 1000){
    		resultStr = resultStr.substring(0,1000)+"......";
    	}
//    	log.info("调用{}结束<-- {} 返回值:{} 耗时:{}ms", Thread.currentThread().getName(), target, JSONObject.toJSONString(result), timeConsuming);
    	log.info("调用{}结束<-- {} 返回值:{} 耗时:{}ms", Thread.currentThread().getName(), target, resultStr, timeConsuming);
    }
    
}
