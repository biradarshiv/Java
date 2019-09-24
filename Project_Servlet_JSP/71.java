package com.jlc.book.shop.action;

import javax.servlet.http.*;

public class LogoutAction {
	public String logout(HttpServletRequest req, HttpServletResponse res){
		String page = "index.jsp";
		req.getSession().invalidate();
		req.setAttribute("loginError", "You have logged out Successfully");
		return page;
	}

}


