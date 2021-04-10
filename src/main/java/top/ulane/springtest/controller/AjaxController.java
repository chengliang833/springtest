package top.ulane.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.ulane.springtest.model.Mytable;
import top.ulane.springtest.service.MytableService;
import top.ulane.springtest.vo.ResponseData;

@RestController
public class AjaxController {
	
	@Autowired
	private MytableService mytableService;
	
	@RequestMapping("/ajaxtest")
	public String ajaxtest() {
		return "hello";
	}
	
	@RequestMapping("/testdao")
	public ResponseData<Mytable> testdao(){
		//由jackson-databind转换为string
		return new ResponseData<Mytable>(mytableService.selectByPrimaryKey(1));
	}
	
}
