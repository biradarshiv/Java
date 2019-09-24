package com.jlc.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlc.book.shop.delegate.UserDelegate;
import com.jlc.book.shop.to.UserTO;
import com.jlc.book.shop.validator.JLCDataValidator;

public class UpdateInfoAction {
	
	public String updateUserInfo(HttpServletRequest req, HttpServletResponse res){
		boolean isError = false;
		String page = "detailsDef.jsp";
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		req.setAttribute("EMAIL", email);
		req.setAttribute("PHONE", phone);
		
		/* VALIDATING EMAIL */
		if(!JLCDataValidator.validateRequired(email)){
			req.setAttribute("email", "email is Required");
			isError = true;
		}else if(!JLCDataValidator.maxLength(email, 32)){
			req.setAttribute("email", "email must be maximum 32 character");
			isError  =true;
		}else if(!JLCDataValidator.validateEmail(email)){
			req.setAttribute("email", "Please enter valid email id");
			isError  =true;
		}
		
		/* VALIDATING PHONE */
		if(!JLCDataValidator.validateRequired(phone)){
			req.setAttribute("phone", "Phone is required");
			isError = true;
		}else if(!JLCDataValidator.validateLong(phone)){
			req.setAttribute("phone", "Phone must be digits Only");
			isError = true;
		}else if(!(JLCDataValidator.minLength(phone, 10) && JLCDataValidator.maxLength(phone, 10))){
			req.setAttribute("phone", "Phone must be 10 digits");
			isError = true;
		}
		
		if(!isError){
			boolean updated = false;
			Object obj = req.getSession().getAttribute("USER_TO");
			UserTO uto = (UserTO)obj;
			updated = UserDelegate.updateUserInfo(uto.getUserId(), email, Long.parseLong(phone));
			if(updated){
				req.setAttribute("updateError", "Information updated successfully");
				req.getSession().removeAttribute("EDIT_INFO");
				uto.setEmail(email);
				uto.setPhone(Long.parseLong(phone));
				req.getSession().setAttribute("USER_TO", uto);
			}else{
				req.setAttribute("updateError", "Error occured while updating the information. Please try later");
			}
		}
		return page;
	}
}




