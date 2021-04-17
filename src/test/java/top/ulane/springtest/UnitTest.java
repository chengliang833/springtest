package top.ulane.springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;

import top.ulane.springtest.service.MytableService;
import wang.ulane.proxy.BeanTest;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//bug，如果直接一级目录classpath:/spring-*.xml，testRecourses无法找到xml，需要pom中主动定义testRecourses(去掉/也不行)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UnitTest {
	
	//已移入ProxyConfig
//	static {
////		ProxyClassLog.proxyMethodLog("wang.ulane.proxy.BeanTest", "test", null);
//		ProxyClassLog.proxyMethodLog("wang.ulane.proxy.BeanTest",
//				new MethodParam("test"),
//				new MethodParam("test", Integer.class, Integer.class, Integer.class)
//				);
//	}
	
	@Autowired
	private MytableService mytableService;
	
	@Test
	public void testMytable(){
		System.out.println(JSON.toJSONString(mytableService.selectByPrimaryKey(1)));
	}
	
	@Test
	public void testAop() throws Exception{
		BeanTest.test();
		BeanTest bt = new BeanTest();
		bt.test(5,6,7);
		System.out.println(123);
	}
	
}
