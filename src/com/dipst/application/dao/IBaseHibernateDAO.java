package com.dipst.application.dao;

import org.hibernate.Session;

public interface IBaseHibernateDAO {
	public Session getSession();
}
