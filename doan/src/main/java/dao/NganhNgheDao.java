package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.nganhnghe;

public class NganhNgheDao {
     Connection con = null;
     PreparedStatement stm = null;
     ResultSet rs ;
     public List<nganhnghe> GetallNN()
     {
    	 List<nganhnghe> list = new ArrayList<nganhnghe>();
    	 String query = "SELECT * FROM doan.nganhnghe";
    	 try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			rs = stm.executeQuery();
			while(rs.next())
			{
				list.add(new nganhnghe(rs.getInt(1),
						rs.getString(2)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 return list;
     }
     public nganhnghe GetNN(String idnn)
     {
    	 String query = "SELECT * FROM doan.nganhnghe where `idnn` = ?";
    	 try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, idnn);
			rs = stm.executeQuery();
			while(rs.next())
			{
				return new nganhnghe(rs.getInt(1),
						rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	 return null;
     }
}
