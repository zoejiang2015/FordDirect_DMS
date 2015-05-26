package com.FDDM.services;
import com.FDDM.models.User;

public interface LoginUser {
	
	public User loginValidation(String username, String password);

}
