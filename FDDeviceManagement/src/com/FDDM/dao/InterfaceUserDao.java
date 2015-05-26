package com.FDDM.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.FDDM.models.User;

public interface InterfaceUserDao {

	// property constants
	public static final String NAME = "name";
	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String PROJECT = "project";


	public abstract void save(User transientInstance);

	public abstract void delete(User persistentInstance);

	public abstract User findById(java.lang.Integer id);

	public abstract List findByExample(User instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByName(Object name);

	public abstract List findByPassword(Object password);

	public abstract List findByRole(Object role);

	public abstract List findByProject(Object project);

	public abstract List findAll();

	public abstract User merge(User detachedInstance);

	public abstract void attachDirty(User instance);

	public abstract void attachClean(User instance);
	


}