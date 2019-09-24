package com.jlc.book.shop.util;

import java.sql.*;
import org.apache.log4j.Logger;

public class JDBCUtil {
	static Logger log = Logger.getLogger(JDBCUtil.class);
	private static Connection con = null;
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			log.error("Error in loading driver class \n ", e);
		}
	}
	
	public static Connection getConnection(){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost/jlconlinebookdb","root","javasree");
		}catch(Exception e){
			log.error("Error in Creating Connection \n ", e);
		}
		return con;
	}
	
	public static void close(ResultSet rs, Statement st, Connection con){
		try{
			if(rs!=null)
				rs.close();
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
		}catch(Exception e){
			log.error("Error in closing the resource \n ", e);
		}
	}

}


