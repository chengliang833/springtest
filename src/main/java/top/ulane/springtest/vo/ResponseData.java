package top.ulane.springtest.vo;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;

public class ResponseData <T> implements Serializable {
	private int code;
	private String msg;
	private T data;
	private String SDFDSF = "SDFDSF11";
	private final static SerializeConfig sc = new SerializeConfig(true);
	
	public ResponseData() {
		super();
	}
	
	public ResponseData(T data) {
		super();
		this.code = 0;
		this.msg = "success";
		this.data = data;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public String getSDFDSF() {
		return SDFDSF;
	}
	public void setSDFDSF(String sDFDSF) {
		SDFDSF = sDFDSF;
	}
	
	public JSONObject toJSON(){
		JSONObject obj = new JSONObject();
		obj.put("code", code);
		obj.put("msg", msg);
		obj.put("data", JSON.parseObject(JSON.toJSONString(data, sc)));
		obj.put("SDFDSF", SDFDSF);
		return obj;
	}
	
}
