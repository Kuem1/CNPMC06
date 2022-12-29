package servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.CvDao;
import dao.KinhnghiemDao;
import dao.NganhNgheDao;
import dao.UserDao;
import model.cv;
import model.kinhnghiem;
import model.nganhnghe;
import model.user;

public class test {
	   public static void main(String[] args)
	   {
		   UserDao dao = new UserDao();
			List<user> list = dao.GetUserKhacIdu("1");
			for(user o : list)
			{
				System.out.print(o);
				
			}
	   }
}