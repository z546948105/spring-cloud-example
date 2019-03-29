package com.erdaoya.springcloud.common.exception.entity;

import lombok.Data;

import java.lang.*;

/**
 * Created by shangshengfang on 2017/2/17.
 */
@Data
public class FullError {
    private String message;
    private java.lang.Error error;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public java.lang.Error getError() {
		return error;
	}
	public void setError(java.lang.Error error) {
		this.error = error;
	}
    
    
}
