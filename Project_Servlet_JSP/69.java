package com.jlc.book.shop.action;

import javax.servlet.http.*;
import com.jlc.book.shop.delegate.UserDelegate;
import com.jlc.book.shop.validator.JLCDataValidator;

public class ForgetPasswordAction {
	
	public String searchPassword(HttpServletRequest req, HttpServletResponse res){
		String page = "forgetPasswordDef.jsp";
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		boolean intractWithDB = true;
		
		if(!JLCDataValidator.validateRequired(uname)){
			req.setAttribute("uname", "UserName is required");
			intractWithDB = false;
		}
		
		if(!JLCDataValidator.validateRequired(email)){
			req.setAttribute("email", "Email is Required");
			intractWithDB = false;
		}else if(!JLCDataValidator.validateEmail(email)){
			req.setAttribute("email", "Please Enter valid email id");
			intractWithDB = false;
		}
		
		if(intractWithDB){
			String password = UserDelegate.searchPassword(uname, email);
			if(password != null){
				req.setAttribute("PASSWORD", password);
			}else{
				req.setAttribute("forgetPasswordError", "Provided information is invalid");
			}
		}
		return page;
	}
}



