package com.lin.exception;
/*
*@author linone
*自定义异常类 
*用来代表预期异常
*/
public class MyException extends Exception {
private String message;

public MyException() {
	super();
}

public MyException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
