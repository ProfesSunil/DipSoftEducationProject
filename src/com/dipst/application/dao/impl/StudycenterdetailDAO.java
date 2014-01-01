package com.dipsoftecheducation.model.studycenterdetail;

import com.dipsoftecheducation.model.roles.BaseHibernateDAO;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Studycenterdetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dipsoftecheducation.model.studycenterdetail.Studycenterdetail
 * @author MyEclipse Persistence Tools
 */
public class StudycenterdetailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StudycenterdetailDAO.class);
	// property constants
	public static final String CENTERID = "centerid";
	public static final String COURSEID = "courseid";
	public static final String STAFFNAME = "staffname";
	public static final String DESIGNATION = "designation";
	public static final String CONTACT = "contact";

	public void save(Studycenterdetail transientInstance) {
		log.debug("saving Studycenterdetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Studycenterdetail persistentInstance) {
		log.debug("deleting Studycenterdetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Studycenterdetail findById(java.lang.Integer id) {
		log.debug("getting Studycenterdetail instance with id: " + id);
		try {
			Studycenterdetail instance = (Studycenterdetail) getSession()
					.get("com.dipsoftecheducation.model.studycenterdetail.Studycenterdetail",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Studycenterdetail instance) {
		log.debug("finding Studycenterdetail instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"com.dipsoftecheducation.model.studycenterdetail.Studycenterdetail")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Studycenterdetail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Studycenterdetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCenterid(Object centerid) {
		return findByProperty(CENTERID, centerid);
	}

	public List findByCourseid(Object courseid) {
		return findByProperty(COURSEID, courseid);
	}

	public List findByStaffname(Object staffname) {
		return findByProperty(STAFFNAME, staffname);
	}

	public List findByDesignation(Object designation) {
		return findByProperty(DESIGNATION, designation);
	}

	public List findByContact(Object contact) {
		return findByProperty(CONTACT, contact);
	}

	public List findAll() {
		log.debug("finding all Studycenterdetail instances");
		try {
			String queryString = "from Studycenterdetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Studycenterdetail merge(Studycenterdetail detachedInstance) {
		log.debug("merging Studycenterdetail instance");
		try {
			Studycenterdetail result = (Studycenterdetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Studycenterdetail instance) {
		log.debug("attaching dirty Studycenterdetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Studycenterdetail instance) {
		log.debug("attaching clean Studycenterdetail instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}