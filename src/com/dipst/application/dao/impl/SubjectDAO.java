package com.dipsoftecheducation.model.subject;

import com.dipsoftecheducation.model.roles.BaseHibernateDAO;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subject entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.dipsoftecheducation.model.subject.Subject
 * @author MyEclipse Persistence Tools
 */
public class SubjectDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SubjectDAO.class);
	// property constants
	public static final String COURSEID = "courseid";
	public static final String COURSECODE = "coursecode";
	public static final String SUBJECTCODE = "subjectcode";
	public static final String SUBJECTDESC = "subjectdesc";

	public void save(Subject transientInstance) {
		log.debug("saving Subject instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subject persistentInstance) {
		log.debug("deleting Subject instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subject findById(java.lang.Integer id) {
		log.debug("getting Subject instance with id: " + id);
		try {
			Subject instance = (Subject) getSession().get(
					"com.dipsoftecheducation.model.subject.Subject", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Subject instance) {
		log.debug("finding Subject instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"com.dipsoftecheducation.model.subject.Subject")
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
		log.debug("finding Subject instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subject as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCourseid(Object courseid) {
		return findByProperty(COURSEID, courseid);
	}

	public List findByCoursecode(Object coursecode) {
		return findByProperty(COURSECODE, coursecode);
	}

	public List findBySubjectcode(Object subjectcode) {
		return findByProperty(SUBJECTCODE, subjectcode);
	}

	public List findBySubjectdesc(Object subjectdesc) {
		return findByProperty(SUBJECTDESC, subjectdesc);
	}

	public List findAll() {
		log.debug("finding all Subject instances");
		try {
			String queryString = "from Subject";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Subject merge(Subject detachedInstance) {
		log.debug("merging Subject instance");
		try {
			Subject result = (Subject) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Subject instance) {
		log.debug("attaching dirty Subject instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subject instance) {
		log.debug("attaching clean Subject instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}