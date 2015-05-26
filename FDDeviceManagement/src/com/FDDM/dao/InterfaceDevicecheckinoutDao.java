package com.FDDM.dao;

import java.util.List;

import com.FDDM.models.Devicecheckinout;

public interface InterfaceDevicecheckinoutDao {

	// property constants
	public static final String TAKEHOME = "takehome";

	public abstract void save(Devicecheckinout transientInstance);

	public abstract void delete(Devicecheckinout persistentInstance);

	public abstract Devicecheckinout findById(java.lang.Integer id);

	public abstract List findByExample(Devicecheckinout instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByTakehome(Object takehome);

	public abstract List findAll();

	public abstract Devicecheckinout merge(Devicecheckinout detachedInstance);

	public abstract void attachDirty(Devicecheckinout instance);

	public abstract void attachClean(Devicecheckinout instance);

}