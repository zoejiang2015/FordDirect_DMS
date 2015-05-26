package com.FDDM.serviceImpl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.FDDM.dao.InterfaceUserDao;
import com.FDDM.models.User;
import com.FDDM.services.LoginUser;

public class LoginUserImpl extends HibernateDaoSupport implements LoginUser {
   private InterfaceUserDao userdao = null;
   
   
   public InterfaceUserDao getUserdao(){
	   return userdao;
   }
   
   public void setUserdao(InterfaceUserDao userdao){
	   this.userdao = userdao;
   }


	public User loginValidation(String username, String password){	
		List userlist = userdao.findByName(username); 
		if(userlist.size()>0){
			User user = (User) userlist.get(0);
			return user;	
		}
		else{
			return null;
		}
	}
   

}
