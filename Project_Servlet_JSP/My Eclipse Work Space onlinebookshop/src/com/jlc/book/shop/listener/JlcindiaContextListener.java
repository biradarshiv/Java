package com.jlc.book.shop.listener;

import javax.servlet.*;
import javax.servlet.http.*;// import javax.servlet.*;  // was repeated twice
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JlcindiaContextListener implements ServletContextListener{
	public void contextDestroyed(ServletContextEvent ctxEvent){
		
	}
	public void contextInitialized(ServletContextEvent ctxEvent){
		ServletContext ctx = ctxEvent.getServletContext();
		String path = ctx.getRealPath("/")+"logs\\";
		System.setProperty("jlcindia.root.path", path);
		String str = ctx.getRealPath("/WEB-INF/classes/com/jlc/jlc-log4j.properties");
		PropertyConfigurator.configure(str);
		Logger log = Logger.getLogger(this.getClass());
		log.info("Properties file : " + str);
	}
}




