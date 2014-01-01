package com.dipst.application.dao;

import org.hibernate.Session;

import com.dipst.application.session.HibernateSessionFactory;

public class BaseHibernateDAO implements IBaseHibernateDAO {

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return HibernateSessionFactory.getSession();
	}

}
