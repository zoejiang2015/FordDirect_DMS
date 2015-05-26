package com.FDDM.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.FDDM.models.Device;
import com.FDDM.models.User;
import com.FDDM.services.UserService;
import com.opensymphony.xwork2.ActionContext;

public class UserAction implements ServletResponseAware{
	private HttpServletRequest request = null;
	private javax.servlet.http.HttpServletResponse response;
	private User newuser;
	private UserService userservice;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public javax.servlet.http.HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(javax.servlet.http.HttpServletResponse response) {
		this.response = response;
	}
	public User getNewuser() {
		return newuser;
	}
	public void setNewuser(User newuser) {
		this.newuser = newuser;
	}
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	public String execute() throws Exception{
		return "fail";
	}
	
	public String showinventory(){
		List allDevice = userservice.getAllDevice();
		List<Device> devices = allDevice;
		if(devices!=null){
			ActionContext.getContext().getSession().put("dv", devices);
			return "success";
		}
		else
			return "fail";
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}

}
