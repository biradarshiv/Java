package com.jlc.book.shop.dao.impl;

import java.sql.*;
import org.apache.log4j.Logger;
import com.jlc.book.shop.dao.UserDAO;
import com.jlc.book.shop.to.UserTO;
import com.jlc.book.shop.util.JDBCUtil;

public class JDBCUserDAO  implements UserDAO{
	Logger log = Logger.getLogger(this.getClass());
	
	public UserTO verifyUser(String username, String password){
		UserTO uto=null;
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			ps = con.prepareStatement("select * from user_table inner join login_table using(userId) where login_table.username=? and login_table.password=? ");  
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();// getting the result set from the Database
			if(rs.next()){
				if(password.equals(rs.getString("password"))){
					String uid = rs.getString("userId");
					String fName = rs.getString("firstName");
					String mName = rs.getString("middleName");
					String lName = rs.getString("lastName");
					String eml = rs.getString("email");
					long phn = rs.getLong("phone");
					String logId = rs.getString("loginId");
					String unm = rs.getString("username");
					String pwd = rs.getString("password");
					String role = rs.getString("role"); // storing all the values into local variables
					uto = new UserTO(fName, mName, lName, eml, phn, unm, pwd, role); // calling the Transfer Object
					uto.setUserId(uid);
					uto.setLoginId(logId);
				}
			}
		}catch(Exception e){
			uto = null;
			log.error("Exception in verifyUser : \n", e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return uto;
	}
	
	public UserTO changePassword (UserTO usto, String password){
		UserTO uto=null;
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con = JDBCUtil.getConnection();
			ps=con.prepareStatement("update login_table set password=? where loginId=?");
			ps.setString(1, "password");
			ps.setString(2, usto.getLoginId());
			int x = ps.executeUpdate();
			if(x > 0){
				usto.setPassword(password);
			}
		}catch (Exception e){
			usto = null;
			log.error("Error in changePassword :\n", e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return usto;
	}
	
	public String searchPassword(String username, String email){
		String password = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement("select * from user_table inner join login_table using (userId) where login_table.username=? and user_table.email=?");
			ps.setString(1, username);
			ps.setString(2, email);
			rs=ps.executeQuery();
			if(rs.next()){
				password = rs.getString("password");
			}
		}catch(Exception e){
			password = null;
			log.error("Exception in searchPassword: \n", e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return password;
	}
	
	public boolean alreadyExist(String username){
		boolean exist = false;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement("select * from login_table where login_table.username=?");
			ps.setString(1, username);
			rs=ps.executeQuery();
			if(rs.next()){
				exist = true;
			}
		}catch(Exception e){
			exist = false;
			log.error("Exception in alreadyExist :\n", e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return exist;
	}
	
	public boolean registerUser(UserTO uto){
		boolean registered = false;
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement("insert into user_table values(?,?,?,?,?,?)");
			String userId = getUserId();
			ps.setString(1, userId);
			ps.setString(2, uto.getFirstName());
			ps.setString(3, uto.getMiddleName());
			ps.setString(4, uto.getLastName());
			ps.setString(5, uto.getEmail());
			ps.setLong(6, uto.getPhone());
			ps.executeUpdate();
			
			ps2 = con.prepareStatement("insert into login_table values(?,?,?,?,?)");
			String loginId = getLoginId();
			ps2.setString(1, loginId);
			ps2.setString(2, userId);
			ps2.setString(3, uto.getUsername() );
			ps2.setString(4, uto.getPassword());
			ps2.setString(5, uto.getRole());
			ps2.executeUpdate();
			con.commit();
			registered = true;
			}catch(Exception e){
			registered = false;
			try{
				con.rollback();
			}catch(Exception e1){
					log.error("Exception in registerUser RollBack: \n", e1);
				}
				log.error("Exception in registerUser: \n", e);
			}finally{
				JDBCUtil.close(rs, ps2, null);
				JDBCUtil.close(rs, ps, con);
			}
		return registered;
	}
	


	private String getUserId() {
		String userId = "";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement("select max(userId) from user_table");
			rs = ps.executeQuery();
			if (rs.next()) {
				String st = rs.getString(1);
				if (st != null) {
					int id = Integer.parseInt(st.substring(6));
					id++;
					if (id <= 9) {
						userId = "JLC-U-000" + id;
					} else if (id <= 99) {
						userId = "JLC-U-00" + id;
					} else if (id <= 999) {
						userId = "JLC-U-0" + id;
					} else {
						userId = "JLC-U-" + id;
					}
				} else {
					userId = "JLC-U-0001";
				}
			} else {
				userId = "JLC-U-0001";
			}
		} catch (Exception e) {
			log.error("Exception in getUserId: \n", e);
		} finally {
			JDBCUtil.close(rs, ps, con);
		}
		return userId;
	}
	
	
	private String getLoginId() {
		String loginId = "";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement("select max(loginId) from login_table");
			rs = ps.executeQuery();
			if (rs.next()) {
				String st = rs.getString(1);
				if (st != null) {
					int id = Integer.parseInt(st.substring(6));
					id++;
					if (id <= 9) {
						loginId = "JLC-L-000" + id;
					} else if (id <= 99) {
						loginId = "JLC-L-00" + id;
					} else if (id <= 999) {
						loginId = "JLC-L-0" + id;
					} else {
						loginId = "JLC-L-" + id;
					}
				} else {
					loginId = "JLC-L-0001";
				}
			} else {
				loginId = "JLC-L-0001";
			}
		} catch (Exception e) {
			log.error("Exception in getLoginId: \n", e);
		} finally {
			JDBCUtil.close(rs, ps, con);
		}
		return loginId;
	}
	
	
	public boolean updateUserInfo(String userId, String email, long phone){
		boolean updated = false;
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		ResultSet rs = null;
		try{
			con=JDBCUtil.getConnection();
			ps = con.prepareStatement("update user_table set email=?, phone=? where userId=?");
			ps.setString(1, email);
			ps.setLong(2, phone);
			ps.setString(3, userId);
			ps.executeUpdate();
			updated = true;
		}catch(Exception e){
			updated = false;
			log.error("Exception in UpdateUserInfo: \n",e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return updated;
	}
	
	
	public UserTO getUserInfoById(String userId){
		UserTO uto = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement("select * from user_table where userId=?");
			ps.setString(1, userId);
			rs = ps.executeQuery();
			if(rs.next()){
				String uid = rs.getString("userId");
				String fName = rs.getString("firstName");
				String mName = rs.getString("middleName");
				String lName = rs.getString("lastName");
				String eml = rs.getString("email");
				long phn = rs.getLong("phone");
				uto = new UserTO(fName,mName, lName, eml,phn,null,null,null);
				uto.setUserId(uid);
			}
		}catch(Exception e){
			uto = null;
			log.error("Exception in getUserInfoById: \n", e);
		}finally{
			JDBCUtil.close(rs, ps, con);
		}
		return uto;
	}
	

}



