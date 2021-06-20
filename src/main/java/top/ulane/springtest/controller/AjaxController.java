package top.ulane.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.config.FastJsonConfig;

import top.ulane.springtest.model.Mytable;
import top.ulane.springtest.service.MytableService;
import top.ulane.springtest.util.Utils;
import top.ulane.springtest.vo.ResponseData;
import wang.ulane.proxy.BeanTest;

@RestController
public class AjaxController {

	@Autowired
	private MytableService mytableService;

	@RequestMapping("/ajaxtest")
	public String ajaxtest() {
		System.out.println(new Utils().utilInvoke(1));
		return "{\"hello\":\"hello\"}";
	}

	@RequestMapping("/testdao")
	public ResponseData<Mytable> testdao() {
		// 由jackson-databind转换为string
		return new ResponseData<Mytable>(mytableService.selectByPrimaryKey(1));
	}

	@RequestMapping("/commonBeanProxy")
	public ResponseData commonBeanProxy() {
		BeanTest.test();
		new BeanTest().test(5, 6, 7);
		return new ResponseData(new ResponseData<>());
	}

	@RequestMapping("/commonBeanProxy2")
	public JSONObject commonBeanProxy2() {
		return new ResponseData(new ResponseData<>()).toJSON();
	}

}
