package com.FDDM.models;

import java.sql.Timestamp;

/**
 * Devicecheckinout entity.
 */

public class Devicecheckinout implements java.io.Serializable {

	// Fields

	private Integer checkid;
	private Device device;
	private User user;
	private Timestamp checkouttime;
	private Timestamp checkintime;
	private Boolean takehome;

	// Constructors

	/** default constructor */
	public Devicecheckinout() {
	}

	/** minimal constructor */
	public Devicecheckinout(Timestamp checkouttime, Timestamp checkintime,
			Boolean takehome) {
		this.checkouttime = checkouttime;
		this.checkintime = checkintime;
		this.takehome = takehome;
	}

	/** full constructor */
	public Devicecheckinout(Device device, User user,
			Timestamp checkouttime, Timestamp checkintime, Boolean takehome) {
		this.device = device;
		this.user = user;
		this.checkouttime = checkouttime;
		this.checkintime = checkintime;
		this.takehome = takehome;
	}

	// Property accessors

	public Integer getCheckid() {
		return this.checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getCheckouttime() {
		return this.checkouttime;
	}

	public void setCheckouttime(Timestamp checkouttime) {
		this.checkouttime = checkouttime;
	}

	public Timestamp getCheckintime() {
		return this.checkintime;
	}

	public void setCheckintime(Timestamp checkintime) {
		this.checkintime = checkintime;
	}

	public Boolean getTakehome() {
		return this.takehome;
	}

	public void setTakehome(Boolean takehome) {
		this.takehome = takehome;
	}

}
