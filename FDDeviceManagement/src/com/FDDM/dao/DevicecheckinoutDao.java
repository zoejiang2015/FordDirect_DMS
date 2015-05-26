package com.FDDM.dao;

import java.sql.Timestamp;
import java.util.List;

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

import com.FDDM.models.Devicecheckinout;

/**
 * A data access object (DAO) providing persistence and search support for
 * Devicecheckinout entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.Devicecheckinout
 * @author MyEclipse Persistence Tools
 */
public class DevicecheckinoutDao extends HibernateDaoSupport implements InterfaceDevicecheckinoutDao {
	private static final Logger log = LoggerFactory
			.getLogger(DevicecheckinoutDao.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#save(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public void save(Devicecheckinout transientInstance) {
		log.debug("saving Devicecheckinout instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#delete(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public void delete(Devicecheckinout persistentInstance) {
		log.debug("deleting Devicecheckinout instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#findById(java.lang.Integer)
	 */
	@Override
	public Devicecheckinout findById(java.lang.Integer id) {
		log.debug("getting Devicecheckinout instance with id: " + id);
		try {
			Devicecheckinout instance = (Devicecheckinout) getHibernateTemplate()
					.get("com.FDDM.models.Devicecheckinout", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#findByExample(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public List findByExample(Devicecheckinout instance) {
		log.debug("finding Devicecheckinout instance by example");
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
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Devicecheckinout instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Devicecheckinout as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#findByTakehome(java.lang.Object)
	 */
	@Override
	public List findByTakehome(Object takehome) {
		return findByProperty(TAKEHOME, takehome);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Devicecheckinout instances");
		try {
			String queryString = "from Devicecheckinout";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#merge(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public Devicecheckinout merge(Devicecheckinout detachedInstance) {
		log.debug("merging Devicecheckinout instance");
		try {
			Devicecheckinout result = (Devicecheckinout) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#attachDirty(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public void attachDirty(Devicecheckinout instance) {
		log.debug("attaching dirty Devicecheckinout instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceDevicecheckinoutDao#attachClean(com.FDDM.models.Devicecheckinout)
	 */
	@Override
	public void attachClean(Devicecheckinout instance) {
		log.debug("attaching clean Devicecheckinout instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InterfaceDevicecheckinoutDao getFromApplicationContext(
			ApplicationContext ctx) {
		return (InterfaceDevicecheckinoutDao) ctx.getBean("DevicecheckinoutDao");
	}
}
