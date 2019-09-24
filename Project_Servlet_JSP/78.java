package com.jlc.book.shop.action;

import java.util.List;
import javax.servlet.http.*;

import com.jlc.book.shop.delegate.OrderDelegate;
import com.jlc.book.shop.to.*;

public class ShowOrderInfoAction {
	public String getOrderInfo(HttpServletRequest req, HttpServletResponse res){
		String page = req.getParameter("page");
		String orderId = req.getParameter("orderId");
		OrderTO oto = OrderDelegate.getOrderByOrderId(orderId);
		req.setAttribute("ORDER_TO", oto);
		List orderList = null;
		if(page.equals("userOrderStatusDef.jsp")){
			Object obj = req.getSession().getAttribute("USER_TO");
			UserTO uto = (UserTO)obj;
			orderList = OrderDelegate.getOrderByUserId(uto.getUserId());
		}else{
			orderList = OrderDelegate.getAllOrderInfo();
		}
		
		if(orderList != null){
			req.setAttribute("ORDER_FOUND", orderList);
		}
		return page;
	}
}



