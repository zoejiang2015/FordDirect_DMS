package com.FDDM.dao;

import java.util.List;

import com.FDDM.models.Device;

public interface InterfaceDeviceDao {

	// property constants
	public static final String BRAND = "brand";
	public static final String TYPE = "type";
	public static final String MODEL = "model";
	public static final String NAME = "name";
	public static final String OS = "os";
	public static final String CHARGE = "charge";
	public static final String CABLE = "cable";

	public abstract void save(Device transientInstance);

	public abstract void delete(Device persistentInstance);

	public abstract Device findById(java.lang.Integer id);

	public abstract List findByExample(Device instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBrand(Object brand);

	public abstract List findByType(Object type);

	public abstract List findByModel(Object model);

	public abstract List findByName(Object name);

	public abstract List findByOs(Object os);

	public abstract List findByCharge(Object charge);

	public abstract List findByCable(Object cable);

	public abstract List findAll();

	public abstract Device merge(Device detachedInstance);

	public abstract void attachDirty(Device instance);

	public abstract void attachClean(Device instance);

}