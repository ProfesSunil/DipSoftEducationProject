package com.dipst.application.sturts.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dipst.application.dao.impl.LoginDAO;
import com.dipst.application.model.Users;
import com.dipst.application.sturts.form.LoginForm;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends Action {
	LoginDAO logdao = new LoginDAO();
	Users user = new Users();

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String target =null;
		try{
			LoginForm logform =(LoginForm)form;
			LoginDAO logDao =new LoginDAO();
			
			System.out.println(logform.getUname()+"\t"+ logform.getPassword());
			
				if(logDao.CheckUsers(logform.getUname(), logform.getPassword())!= null){
						target ="success";
				}else
					target ="failure";
		}catch(Exception ex ){
			System.out.println(ex.getMessage());
		}
		return mapping.findForward(target);
	}
}
