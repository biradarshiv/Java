package com.jlc.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jlc.book.shop.delegate.UserDelegate;
import com.jlc.book.shop.to.UserTO;
import com.jlc.book.shop.validator.JLCDataValidator;


public class RegisterAction {
	
	public String registerStudent(HttpServletRequest req, HttpServletResponse res){
		boolean isError = false;
		String page = "registerDef.jsp";
		String fname = req.getParameter("fname");
		String mname = req.getParameter("mname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		/* VALIDATING FIRST NAME */
		if(!JLCDataValidator.validateRequired(fname)){
			req.setAttribute("fname", "first name is Required");
			isError = true;
		}else if(!JLCDataValidator.validateFirstCharacterAsUpper(fname)){
			req.setAttribute("fname", "first name must start with capital character");
			isError  =true;
		}else if(!JLCDataValidator.minLength(fname, 3)){
			req.setAttribute("fname", "first name must be minimun 3 character");
			isError = true;
		}else if(!JLCDataValidator.maxLength(fname, 10)){
			req.setAttribute("fname", "first name must be maximum 10 character");
			isError  =true;
		}else if(!JLCDataValidator.validateName(fname)){
			req.setAttribute("fname", "first name must be only characters");
			isError  =true;
		}
		
		/* VALIDATING MIDDLE NAME */
		if(mname!=null && mname.length()>0){
			if(!JLCDataValidator.validateFirstCharacterAsUpper(mname)){
				req.setAttribute("mname", "middle name must start with capital character");
				isError  =true;
			}else if(!JLCDataValidator.minLength(mname, 1)){
				req.setAttribute("mname", "middle name must be minimun 1 character");
				isError = true;
			}else if(!JLCDataValidator.maxLength(mname, 10)){
				req.setAttribute("mname", "middle name must be maximum 10 character");
				isError  =true;
			}else if(!JLCDataValidator.validateName(mname)){
				req.setAttribute("mname", "middle name must be only characters");
				isError  =true;
			}
		}
		
		/* VALIDATING LAST NAME */
		if(lname!=null && lname.length()>0){
			if(!JLCDataValidator.validateFirstCharacterAsUpper(lname)){
				req.setAttribute("lname", "last name must start with capital character");
				isError  =true;
			}else if(!JLCDataValidator.minLength(lname, 3)){
				req.setAttribute("lname", "last name must be minimun 1 character");
				isError = true;
			}else if(!JLCDataValidator.maxLength(lname, 10)){
				req.setAttribute("lname", "last name must be maximum 10 character");
				isError  =true;
			}else if(!JLCDataValidator.validateName(lname)){
				req.setAttribute("lname", "last name must be only characters");
				isError  =true;
			}
		}
		
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
		
		// VALIDATING GENDER
		if(!JLCDataValidator.validateRequired(gender)){
			req.setAttribute("gender", "Please select the gender");
			isError = true;
		}
		
		/* VALIDATING USERNAME */
		if(!JLCDataValidator.validateRequired(username)){
			req.setAttribute("uname", "username is Required");
			isError = true;
		}else if(!JLCDataValidator.minLength(username, 6)){
			req.setAttribute("uname", "username must be minimun 6 character");
			isError = true;
		}else if(!JLCDataValidator.maxLength(username, 8)){
			req.setAttribute("uname", "username must be maximum 8 character");
			isError  =true;
		}else if(UserDelegate.alreadyExist(username)){
			req.setAttribute("uname", "UserName is already used.Please use different username");
			isError = true;
		}
		
		/* VALIDATING PASSWORD */
		if(!JLCDataValidator.validateRequired(password)){
			req.setAttribute("pass", "password is Required");
			isError = true;
		}else if(!JLCDataValidator.minLength(password, 6)){
			req.setAttribute("pass", "password must be minimun 6 character");
			isError = true;
		}else if(!JLCDataValidator.maxLength(password, 15)){
			req.setAttribute("pass", "password must be maximum 15 character");
			isError  =true;
		}
		
		if(isError){
			boolean registered = false;
			UserTO uto = new UserTO(fname,mname,lname,email,Long.parseLong(phone),username,password,"User");
			registered = UserDelegate.registerUser(uto);
			if(registered){
				req.setAttribute("registrationError", "Registration completes successfully");
			}else{
				req.setAttribute("REGISTERED", "OK");
				req.setAttribute("registrationError", "Error happened in registration. Please try later");
			}
		}
		return page;
	}

}





