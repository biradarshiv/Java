package com.jlc.book.shop.action;

import javax.servlet.http.*;
import com.jlc.book.shop.delegate.BookDelegate;
import com.jlc.book.shop.to.BookTO;
import com.jlc.book.shop.validator.JLCDataValidator;


public class AddBookAction {

	public String addBookInfo(HttpServletRequest request,HttpServletResponse response){
		String page="addBookDef.jsp";
		String bnm = request.getParameter("baname");
		String author = request.getParameter("author");
		String cost = request.getParameter("cost");
		String pub = request.getParameter("publication");
		String edi = request.getParameter("edition");
		float bcost = 0.0f;
		boolean convertCost = true;
		boolean intractWithDB = true;
		//VALIDATING BOOK NAME
		if(!JLCDataValidator.validateRequired(bnm)){
			request.setAttribute("bname", "Book Name is Required");
			intractWithDB = false;
		}else if(!JLCDataValidator.minLength(bnm, 3)){
			request.setAttribute("bname", "Book name must be minimum 3 character");
			intractWithDB = false;
		}else if(!JLCDataValidator.maxLength(bnm, 60)){
			request.setAttribute("bname", "Book name must be maximum 60 character");
			intractWithDB = false;
		}
		
		//VALIDATING AUTHOR NAME
		if(!JLCDataValidator.validateRequired(author)){
			request.setAttribute("author", "Author is Required");
			intractWithDB = false;
		}else if(!JLCDataValidator.minLength(author, 3)){
			request.setAttribute("author", "Author name must be minimum 3 character");
			intractWithDB = false;
		}else if(!JLCDataValidator.maxLength(author, 60)){
			request.setAttribute("author", "Author name must be maximum 60 character");
			intractWithDB = false;
		}
		
		if(!JLCDataValidator.validateRequired(cost)){
			request.setAttribute("cost", "Cost is Required");
			intractWithDB = false;
			convertCost = false;
		}
		
		if(!JLCDataValidator.validateRequired(edi)){
			request.setAttribute("edition", "Edition is Required");
			intractWithDB = false;
		}
		
		if(!JLCDataValidator.validateRequired(pub)){
			request.setAttribute("publication", "Publication is Required");
			intractWithDB = false;
		}else if(!JLCDataValidator.minLength(pub, 3)){
			request.setAttribute("publication", "Publication name must be minimum 3 character");
			intractWithDB = false;
		}else if(!JLCDataValidator.maxLength(pub, 50)){
			request.setAttribute("publication", "Publication name must be maximum 50 character");
			intractWithDB = false;
		}
		
		if(convertCost){
			try{
				bcost=Float.parseFloat(cost);
			}catch(NumberFormatException e){
				request.setAttribute("cost", "Cost is not valid");
				intractWithDB = false;
			}
		}
		
		if(intractWithDB){
			BookTO bto = new BookTO(bnm,author,pub,edi,bcost);
			if(BookDelegate.alreadyExist(bto)){
				request.setAttribute("addingBookError", "Book information already available");
			}else{
				boolean added = BookDelegate.addBook(bto);
				if(added){
					request.setAttribute("addingBookError", "Book information added successfully");
					request.setAttribute("SHOW_ADD_BOOK", "OK");
				}else{
					request.setAttribute("addingBookError", "Error in adding book information");
				}
			}
		}
		return page;
	}
}



