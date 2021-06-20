package top.ulane.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.ulane.springtest.vo.ResponseData;

@Controller
public class HelloController {
	
	@RequestMapping("/hello1.do")
	public String hello1() {
		Integer.parseInt("124a");
		return "hello";
	}

	@RequestMapping("/hello2.do")
	public String hello2() {
		String str = "abcd";
		str.charAt(10);
		return "hello";
	}
	
	@RequestMapping("/hello3")
	public ResponseData hello3() {
		return new ResponseData<>();
	}

}
