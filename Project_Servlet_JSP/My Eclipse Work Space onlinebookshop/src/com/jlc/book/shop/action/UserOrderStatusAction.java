package com.jlc.book.shop.action;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlc.book.shop.delegate.OrderDelegate;
import com.jlc.book.shop.to.UserTO;

public class UserOrderStatusAction {
	
	public String getUserOrderStatus(HttpServletRequest req, HttpServletResponse res){
		String page = "userOrderStatusDef.jsp";
		Object obj = req.getSession().getAttribute("USER_TO");
		UserTO uto = (UserTO)obj;
		List orderList = OrderDelegate.getOrderByUserId(uto.getUserId());
		if(orderList != null){
			req.setAttribute("ORDER_FOUND", orderList);
		}
		return page;
	}

}
