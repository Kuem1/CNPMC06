package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CvDao;
import dao.KinhnghiemDao;
import dao.NganhNgheDao;
import model.cv;
import model.kinhnghiem;
import model.nganhnghe;

/**
 * Servlet implementation class testting
 */
@WebServlet("/testting")
public class testting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CvDao dao = new CvDao();
		cv cv = dao.getCvbyidcv("1");
		KinhnghiemDao daokn = new KinhnghiemDao();
	    List<kinhnghiem> listkn = daokn.getKinhNghiemById("1");
	    request.setAttribute("listkn", listkn);
		request.setAttribute("cv", cv);
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
