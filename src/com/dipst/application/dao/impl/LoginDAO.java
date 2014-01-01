package com.dipst.application.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dipst.application.dao.BaseHibernateDAO;

import roseindia.dao.hibernate.Login;

public class LoginDAO extends BaseHibernateDAO{
	
	public Login CheckUsers(String userName, String password) {
		List<Login> logins = new ArrayList<>();
		try {
			logins = getSession().createCriteria(
					"from Login where uname='" + userName + "'+ and password ="+
						password	+ "'").list();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (logins.size() > 0) {
			return logins.get(0);
		} else {
			return null;
		}
	}
}
