package com.qf.usersystem.util;
/**
*@author 张朝雨
*响应实体类
*Created on 2019年12月21日 上午9:21:52
*
*Copyright 2019 UItrapower,Inc. All rights revserved.
*
*/

public class Result {
private Integer status ;//状态码
private String message;//响应信息
public Integer getStatus() {
	return status;
}
/**
 * 设置状态码
 * @param status
 */
public void setStatus(Integer status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
/**
 * 设置响应信息
 * @param message
 */
public void setMessage(String message) {
	this.message = message;
}



}
