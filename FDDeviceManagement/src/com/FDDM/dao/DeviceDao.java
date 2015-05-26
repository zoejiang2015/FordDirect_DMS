package com.FDDM.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.FDDM.models.Device;

/**
 * A data access object (DAO) providing persistence and search support for
 * Device entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.dao.Device
 * @author MyEclipse Persistence Tools
 */

public class DeviceDao extends HibernateDaoSupport implements InterfaceDeviceDao {
	private static final Logger log = LoggerFactory.getLogger(DeviceDao.class);
	

//	private SessionFactory sessionFactory;
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
//
//	private Session getCurrentSession() {
//		return sessionFactory.getCurrentSession();
//	}

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#save(com.FDDM.models.Device)
	 */
	@Override
	public void save(Device transientInstance) {
		log.debug("saving Device instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#delete(com.FDDM.models.Device)
	 */
	@Override
	public void delete(Device persistentInstance) {
		log.debug("deleting Device instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findById(java.lang.Integer)
	 */
	@Override
	public Device findById(java.lang.Integer id) {
		log.debug("getting Device instance with id: " + id);
		try {
			Device instance = (Device) getHibernateTemplate().get(
					"com.FDDM.models.Device", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByExample(com.FDDM.models.Device)
	 */
	@Override
	public List findByExample(Device instance) {
		log.debug("finding Device instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Device instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Device as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByBrand(java.lang.Object)
	 */
	@Override
	public List findByBrand(Object brand) {
		return findByProperty(BRAND, brand);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByType(java.lang.Object)
	 */
	@Override
	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByModel(java.lang.Object)
	 */
	@Override
	public List findByModel(Object model) {
		return findByProperty(MODEL, model);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByName(java.lang.Object)
	 */
	@Override
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByOs(java.lang.Object)
	 */
	@Override
	public List findByOs(Object os) {
		return findByProperty(OS, os);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByCharge(java.lang.Object)
	 */
	@Override
	public List findByCharge(Object charge) {
		return findByProperty(CHARGE, charge);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findByCable(java.lang.Object)
	 */
	@Override
	public List findByCable(Object cable) {
		return findByProperty(CABLE, cable);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Device instances");
		try {
			String queryString = "from Device";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#merge(com.FDDM.models.Device)
	 */
	@Override
	public Device merge(Device detachedInstance) {
		log.debug("merging Device instance");
		try {
			Device result = (Device) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#attachDirty(com.FDDM.models.Device)
	 */
	@Override
	public void attachDirty(Device instance) {
		log.debug("attaching dirty Device instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDeviceDao#attachClean(com.FDDM.models.Device)
	 */
	@Override
	public void attachClean(Device instance) {
		log.debug("attaching clean Device instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InterfaceDeviceDao getFromApplicationContext(ApplicationContext ctx) {
		return (InterfaceDeviceDao) ctx.getBean("DeviceDao");
	}
}
