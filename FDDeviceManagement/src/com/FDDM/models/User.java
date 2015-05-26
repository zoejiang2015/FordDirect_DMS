package com.FDDM.models;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private String role;
	private String project;
	private Set devicecheckinouts = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String project) {
		this.project = project;
	}

	/** full constructor */
	public User(String name, String password, String role, String project,
			Set devicecheckinouts) {
		this.name = name;
		this.password = password;
		this.role = role;
		this.project = project;
		this.devicecheckinouts = devicecheckinouts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Set getDevicecheckinouts() {
		return this.devicecheckinouts;
	}

	public void setDevicecheckinouts(Set devicecheckinouts) {
		this.devicecheckinouts = devicecheckinouts;
	}

}
