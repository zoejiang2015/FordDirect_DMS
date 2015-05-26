package com.FDDM.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Device entity. 
 */

public class Device implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private Integer id;
	private String brand;
	private String type;
	private String model;
	private String name;
	private String os;
	private Boolean charge;
	private Boolean cable;
	private Date intime;
	private Date decommissiontime;
	private Set devicecheckinouts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Device() {
	}

	/** full constructor */
	public Device(String brand, String type, String model, String name,
			String os, Boolean charge, Boolean cable, Date intime,
			Date decommissiontime, Set devicecheckinouts) {
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.name = name;
		this.os = os;
		this.charge = charge;
		this.cable = cable;
		this.intime = intime;
		this.decommissiontime = decommissiontime;
		this.devicecheckinouts = devicecheckinouts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Boolean getCharge() {
		return this.charge;
	}

	public void setCharge(Boolean charge) {
		this.charge = charge;
	}

	public Boolean getCable() {
		return this.cable;
	}

	public void setCable(Boolean cable) {
		this.cable = cable;
	}

	public Date getIntime() {
		return this.intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public Date getDecommissiontime() {
		return this.decommissiontime;
	}

	public void setDecommissiontime(Date decommissiontime) {
		this.decommissiontime = decommissiontime;
	}

	public Set getDevicecheckinouts() {
		return this.devicecheckinouts;
	}

	public void setDevicecheckinouts(Set devicecheckinouts) {
		this.devicecheckinouts = devicecheckinouts;
	}

}