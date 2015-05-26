package com.FDDM.dao;
import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.FDDM.models.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.dao.User
 * @author MyEclipse Persistence Tools
 */

public class UserDao extends HibernateDaoSupport implements InterfaceUserDao {
	private static final Logger log = LoggerFactory.getLogger(UserDao.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#save(com.FDDM.models.User)
	 */
	@Override
	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#delete(com.FDDM.models.User)
	 */
	@Override
	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findById(java.lang.Integer)
	 */
	@Override
	public User findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getHibernateTemplate().get("com.FDDM.models.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findByExample(com.FDDM.models.User)
	 */
	@Override
	public List findByExample(User instance) {
		log.debug("finding User instance by example");
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
	 * @see com.FDDM.dao.InterfaceUserDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
			
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findByName(java.lang.Object)
	 */
	public List findByName(Object name){
		return findByProperty(NAME, name);
    }

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findByPassword(java.lang.Object)
	 */
	@Override
	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findByRole(java.lang.Object)
	 */
	@Override
	public List findByRole(Object role) {
		return findByProperty(ROLE, role);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findByProject(java.lang.Object)
	 */
	@Override
	public List findByProject(Object project) {
		return findByProperty(PROJECT, project);
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#merge(com.FDDM.models.User)
	 */
	@Override
	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#attachDirty(com.FDDM.models.User)
	 */
	@Override
	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.FDDM.dao.InterfaceUserDao#attachClean(com.FDDM.models.User)
	 */
	@Override
	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InterfaceUserDao getFromApplicationContext(ApplicationContext ctx) {
		return (InterfaceUserDao) ctx.getBean("UserDao");
	}

}