package top.ulane.springtest.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	// 这是一个异常处理方法，专门用来
	// 处理其它方法所抛出的异常。
	// 注: ex 是其它方法所抛出的异常。
	public String execute(Exception ex, HttpServletRequest request) {
		ex.printStackTrace();
		if (ex instanceof NumberFormatException) {
			request.setAttribute("errMsg", "亲，请输入正常的数字!");
			return "error";
		}
		if (ex instanceof StringIndexOutOfBoundsException) {
			request.setAttribute("errMsg", "数组越界");
			return "error";
		}
		return "error2";
	}

}
