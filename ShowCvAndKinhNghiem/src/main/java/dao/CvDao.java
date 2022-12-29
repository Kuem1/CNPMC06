package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.cv;

public class CvDao {
	Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs;
	public List<cv> getCvbyid(String id)
    {
    	List<cv> list = new ArrayList<cv>();
    	String query = "SELECT * FROM doan.cv where idu = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			rs = stm.executeQuery();
			while(rs.next())
			{
				list.add(new cv(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getInt(14),
						rs.getInt(15)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
    	
    }
	public cv getCvbyidcv(String id)
    {
    	String query = "SELECT * FROM doan.cv where idcv = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			rs = stm.executeQuery();
			while(rs.next())
			{
				return new cv(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getInt(14),
						rs.getInt(15));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
    	
    }
}
