package top.ulane.springtest.config;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import wang.ulane.log.LogAspect;
import wang.ulane.proxy.MethodParam;
import wang.ulane.proxy.ProxyClass;
import wang.ulane.proxy.ProxyClassLog;

@Component
public class ProxyConfig {

	static {
		//仅编译需要，通过tomcat启动才需要指定
		//项目路径，未用到可以不加
//		ProxyClass.addRelateClassPath(ProxyConfig.class.getResource("/").getPath());
		//需要代理的对象如果在jar包中需要指定；但是需要用同一个jar包中的另一个class，否则会load两次
//		ProxyClass.addRelateClassPath(LogAspect.class);
//		//methodBody中需要的jar路径
//		ProxyClass.addRelateClassPath(JSON.class);
		
		Map<String, List<MethodParam>> map = ProxyClass.getMethodList("properties/app.properties", "log.proxys.list");
		ProxyClassLog.proxyMethodLog(map);
		
//		ProxyClassLog.proxyMethodLog("wang.ulane.proxy.BeanTest",
//				new MethodParam("test"),
//				new MethodParam("test", Integer.class, Integer.class, Integer.class)
//				);
	}
	
}
