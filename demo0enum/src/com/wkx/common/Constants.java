package com.wkx.common;

public class Constants {
	/**
	 * 一个枚举
	 */
	public enum Response{
		WKX01(001,"错误01"),
		WKX02(002,"错误02"),
		;
		private Integer code;
		public Integer getCode() {
			return code;
		}


		public String getMassage() {
			return massage;
		}


		private String massage;
		
		
	 Response(Integer code, String massage) {
			this.code = code;
			this.massage = massage;
		}
		
		
	}
	
	/**
	 * 另外一个枚举
	 */
	public enum Return{
		
		VEISA(003,"另外的第一个错误"),
		VEISB(004,"另外的第二个错误"),
		;
		private Integer code;
		public Integer getCode() {
			return code;
		}



		public String getMessage() {
			return message;
		}



		private String message;
	
		
		
		Return(Integer code, String message) {
			this.code = code;
			this.message = message;
		}
		
	}
}
