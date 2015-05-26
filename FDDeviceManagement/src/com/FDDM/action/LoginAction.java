package com.FDDM.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.FDDM.models.User;
import com.FDDM.services.LoginUser;

public class LoginAction extends ActionSupport {
    private String username; 
    private String password;
    private String tip;
    private HttpServletRequest request = null;
    private LoginUser loginuser;
	
	public HttpServletRequest getRequest(){
		return request;
	}
	
	public void setRequest(HttpServletRequest request){
		this.request = request;
	}

    public LoginUser getLoginuser(){
    	return loginuser;
    }
    
    public void setLoginuser(LoginUser loginuser){
    	this.loginuser = loginuser;
    }

    public String getUsername(){
    	return username;
    }

    public void setUsername(String username){
    	this.username = username;
    }
    
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	

	public String execute() throws Exception{
		User user = loginuser.loginValidation(username, password);
			   if(user != null){
				   if(password.equals(user.getPassword())){
			         ActionContext.getContext().getSession().put("usersession", user);	
			         ActionContext.getContext().getSession().put("username", user.getName());
			            if(user.getRole().equalsIgnoreCase("normal")){
				          return "usersuccess";
			             }else if(user.getRole().equalsIgnoreCase("admin")){
				          return "adminsuccess";
			             }else{return "fail";}
				     }else{
				    	 this.addFieldError(password, "Invalid password!");
		            return "input";
		            }
			   }else{
				   this.addFieldError(username, "Invalid User Name!");
		           return "input"; 
			   }
			}
	
    	   
}



