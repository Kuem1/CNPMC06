package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.user;

public class UserDao {
	Connection con = null;
	  PreparedStatement stm = null;
	  ResultSet rs = null;
  public user login(String username, String password)
  {
	 String query = "SELECT * FROM doan.user where `username` = ? and `password` = ?";
	 try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, username);
		stm.setString(2, password);
		rs = stm.executeQuery();
		while(rs.next())
		{
			return new user(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4));
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
	return null;
	  
  }
	  