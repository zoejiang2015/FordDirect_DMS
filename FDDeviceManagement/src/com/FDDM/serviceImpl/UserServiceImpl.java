package com.FDDM.serviceImpl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.FDDM.dao.InterfaceDeviceDao;
import com.FDDM.models.Device;
import com.FDDM.services.UserService;

public class UserServiceImpl extends HibernateDaoSupport implements UserService {
  private InterfaceDeviceDao devicedao = null;

public InterfaceDeviceDao getDevicedao() {
	return devicedao;
}

public void setDevicedao(InterfaceDeviceDao devicedao) {
	this.devicedao = devicedao;
}

public List getAllDevice(){
	List<Device> devices=devicedao.findAll();
	return devices;
}
  
}
