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
	ResultSet rs = null;
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
    public void deleteCv(String id)
    {
    	String query = "DELETE FROM `doan`.`cv` WHERE (`idcv` = ?);";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void insertCv(String name, String email, String phone, String hobby, String idu)
    {
    	String query="INSERT INTO `doan`.`cv` (`name`, `email`, `phone`, `hobby`, `idu`) VALUES (?, ?, ?, ?, ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, phone);
			stm.setString(4, hobby);
			stm.setString(5, idu);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void updateCv(String idcv, String name, String email, String phone, String hobby, String dob, String old, String adress, String job, String career,String technical, String gender, String idu)
    {
    	String query = "UPDATE `doan`.`cv` SET `name` = ?, `email` = ?, `phone` = ?, `hobby` = ?, `dob` = ?, `old` = ?, `adress` = ?, `job` = ?, `career` = ?, `technical` = ?, `gender` = ?, `idu` = ? WHERE (`idcv` = ?);";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, phone);
			stm.setString(4, hobby);
			stm.setString(5, dob);
			stm.setString(6, old);
			stm.setString(7, adress);
			stm.setString(8, job);
			stm.setString(9, career);
			stm.setString(10, technical);
			stm.setString(11, gender);
			stm.setString(12, idu);
			stm.setString(13, idcv);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public List<cv> searchCV(String name, String idu)
    {
    	List<cv> list = new ArrayList<cv>();
    	String query = "SELECT * FROM doan.cv where `name` like ? and `idu` = ? ";
    	try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1,"%"+ name +"%");
		stm.setString(2, idu);
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
    public void InsertNameCv(String namecv, String idu)
    {
    	String query = "INSERT INTO `doan`.`cv` (`namecv`,  `idu`) VALUES ( ?, ?)";
       try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, namecv);
		stm.setString(2, idu);
		stm.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
    public List<cv> GetCvByIdNNIdu(String idnn, String idu)
    {
    	List<cv> list = new ArrayList<cv>();
    	String query = "SELECT * FROM doan.cv where `idnn` = ? and `idu` = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, idnn);
			stm.setString(2, idu);
			rs = stm.executeQuery();
			while(rs.next()){
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
    public void DeleteCvInNN(String idcv)
    {
    	String query = "UPDATE `doan`.`cv` SET `idnn` = null WHERE (`idcv` = ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, idcv);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void ChosseCvInNN(String idnn, String idcv)
    {
    	String query = "UPDATE `doan`.`cv` SET `idnn` = ? WHERE (`idcv` = ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, idnn);
			stm.setString(2, idcv);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void InsertCvInNN(String idcv,String namecv, String name, String email, String phone, String hobby, String dob, String old, String adress, String job, String career,String technical, String gender, String idu)
    {
    	String query = "INSERT INTO `doan`.`cv` (`idcv`,  `namecv`,`name`,`email`,`phone`,`hobby`,`dob`,`old`,`adress`,`job`,`career`,`technical`,`gender`,`idu` ) VALUES ( ?, ? , ?, ? , ?, ? , ?, ? , ?, ? , ?, ? , ?, ?  )";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1,idcv);
			stm.setString(2, namecv);
			stm.setString(3, name);
			stm.setString(4, email);
			stm.setString(5, phone);
			stm.setString(6, hobby);
			stm.setString(7, dob);
			stm.setString(8, old);
			stm.setString(9, adress);
			stm.setString(10, job);
			stm.setString(11, career);
			stm.setString(12, technical);
			stm.setString(13, gender);
			stm.setString(14, idu);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
//    public void updateCvNN(String idcv,String namecv, String name, String email, String phone, String hobby, String dob, String old, String adress, String job, String career,String technical, String gender, String idu)
//    {
//    	String query = "UPDATE `doan`.`cv` SET `idcv` = ? , `namecv` = ? ,`name` = ? ,`email` = ? ,`phone` = ? ,`hobby` = ? ,`dob` = ? ,`old` = ? ,`adress` = ? ,`job` = ? ,`career` = ? ,`technical` = ? ,`gender` = ? ,`idu` = ? WHERE (`idcv` = ?);";
//    	try {
//    		con = DbCon.getConnection();
//			stm = con.prepareStatement(query);
//			stm.setString(1,idcv);
//			stm.setString(2, namecv);
//			stm.setString(3, name);
//			stm.setString(4, email);
//			stm.setString(5, phone);
//			stm.setString(6, hobby);
//			stm.setString(7, dob);
//			stm.setString(8, old);
//			stm.setString(9, adress);
//			stm.setString(10, job);
//			stm.setString(11, career);
//			stm.setString(12, technical);
//			stm.setString(13, gender);
//			stm.setString(14, idu);
//			stm.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    }
}
