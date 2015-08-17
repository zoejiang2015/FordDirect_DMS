package com.FDDM.serviceImpl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.FDDM.dao.InterfaceDeviceDao;
import com.FDDM.dao.InterfaceDevicecheckinoutDao;
import com.FDDM.models.Device;
import com.FDDM.models.Devicecheckinout;
import com.FDDM.services.UserService;

public class UserServiceImpl extends HibernateDaoSupport implements UserService {
  private InterfaceDeviceDao devicedao = null;
  private InterfaceDevicecheckinoutDao checkinoutdao =null;

public InterfaceDeviceDao getDevicedao() {
	return devicedao;
}

public void setDevicedao(InterfaceDeviceDao devicedao) {
	this.devicedao = devicedao;
}

public InterfaceDevicecheckinoutDao getCheckinoutdao() {
	return checkinoutdao;
}

public void setCheckinoutdao(InterfaceDevicecheckinoutDao checkinoutdao) {
	this.checkinoutdao = checkinoutdao;
}


public List getAllDevice(){
	List<Device> devices=devicedao.findAll();
	return devices;
}

public List getcheckinoutList(){
	List<Devicecheckinout> devicecheckinoutlist=checkinoutdao.findAll();
	return devicecheckinoutlist;
}
  
}
