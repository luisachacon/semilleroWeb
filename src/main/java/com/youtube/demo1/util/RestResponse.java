package com.youtube.demo1.util;

public class RestResponse {

	
	private Integer reesponseCode;
	private String message;
	
	public RestResponse(Integer responseCode) {
		super();
		this.reesponseCode=responseCode;
	}
	
	public RestResponse(Integer responseCode,String message) {
		super();
		this.reesponseCode=responseCode;
		this.message=message;
	}
	
	
	public Integer getReesponseCode() {
		return reesponseCode;
	}
	public void setReesponseCode(Integer reesponseCode) {
		this.reesponseCode = reesponseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
