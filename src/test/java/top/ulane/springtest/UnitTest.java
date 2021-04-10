package top.ulane.springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;

import top.ulane.springtest.aop.test.BeanTest;
import top.ulane.springtest.service.MytableService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//bug，如果直接一级目录classpath:/spring-*.xml，testRecourses无法找到xml，需要pom中主动定义testRecourses(去掉/也不行)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UnitTest {
	
	@Autowired
	private MytableService mytableService;
	
	@Test
	public void testMytable(){
		System.out.println(JSON.toJSONString(mytableService.selectByPrimaryKey(1)));
	}
	
	@Test
	public void testAop(){
		BeanTest bt = new BeanTest();
		bt.test();
		System.out.println(123);
	}
	
	
}
