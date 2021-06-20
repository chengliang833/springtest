//package top.ulane.springtest.config;
//
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.http.server.ServletServerHttpRequest;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.serializer.SerializeConfig;
//
//import top.ulane.springtest.controller.AjaxController;
//
//@ControllerAdvice(assignableTypes=AjaxController.class)
//public class ReturnDataAdvice implements ResponseBodyAdvice {
//
//	//objectMapper只能全局配置
//	private SerializeConfig sc = new SerializeConfig(true);
//	
//	@Override
//	public boolean supports(MethodParameter returnType, Class converterType) {
//		return true;
//	}
//
//	@Override
//	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
//			Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//		System.out.println(((ServletServerHttpRequest)request).getServletRequest().getRequestURI());
//		String uri = ((ServletServerHttpRequest)request).getServletRequest().getRequestURI();
////		if(!"/springtest/commonBeanProxy".equals(uri)){
//			return body;
////		}
////		return JSON.parseObject(JSON.toJSONString(body, sc));
//	}
//
//}
