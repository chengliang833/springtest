//package top.ulane.springtest.config;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.stereotype.Component;
//
//import wang.ulane.proxy.MethodParam;
//import wang.ulane.proxy.ProxyClass;
//import wang.ulane.proxy.ProxyClassLog;
//import wang.ulane.proxy.ProxyPoint;
//
//@Component
//public class ProxyConfig {
//
//	static {
//		//仅编译需要，通过tomcat启动才需要指定
//		//项目路径，未用到可以不加
////		ProxyClass.addRelateClassPath(ProxyConfig.class.getResource("/").getPath());
//		//需要代理的对象如果在jar包中需要指定；但是需要用同一个jar包中的另一个class，否则会load两次
////		ProxyClass.addRelateClassPath(LogAspect.class);
////		//methodBody中需要的jar路径
////		ProxyClass.addRelateClassPath(JSON.class);
//
////		ProxyClassLog.proxyMethodLog("wang.ulane.proxy.BeanTest",
////				new MethodParam("test"),
////				new MethodParam("test", Integer.class, Integer.class, Integer.class)
////				);
//		
//		ProxyClass.initClass("properties/app.properties", "logext.proxys.initclass");
//		Map<String, List<MethodParam>> map = ProxyClass.getMethodList("properties/app.properties", "logext.proxys.list");
//		ProxyClassLog.proxyMethodLog(map);
//		
//	}
//
//	public static Object testProxy(ProxyPoint proxyPoint) throws Exception{
//		//before
//		System.out.println("before");
//		//proceed
//		Object result = proxyPoint.proceed();
////		Object result = 0;
//		//after
//		System.out.println("after:"+result);
//		return result;
//	}
//	
//}
