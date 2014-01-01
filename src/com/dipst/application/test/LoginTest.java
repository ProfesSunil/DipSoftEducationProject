package com.dipst.application.test;

import java.util.ArrayList;
import java.util.List;

import com.dipst.application.dao.BaseHibernateDAO;

import roseindia.dao.hibernate.Login;

public class LoginTest extends BaseHibernateDAO {

		public void log(String usern,String pss){
			List<Login> logins = new ArrayList<>();
			try {
				logins = getSession().createCriteria(
						"from Login where uname='" + usern + "'+ and password ="+
							pss	+ "'").list();

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			if (logins.size() > 0) {
			System.out.println("Found");
			} else {
				System.out.println("Not Found");
			}


		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTest lotest =new LoginTest();
		lotest.log("Sunil","Kumar");
				}

}
