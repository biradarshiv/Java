package com.jlc.book.shop.action;

import javax.servlet.http.*;

public class CancleEditInfoAction {
	
	public String cancleEditInfo(HttpServletRequest req, HttpServletResponse res){
		String page="detailsDef.jsp";
		req.getSession().removeAttribute("EDIT_INFO");
		return page;
	}
}


