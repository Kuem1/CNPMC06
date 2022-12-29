package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CvDao;
import dao.KinhnghiemDao;
import model.cv;
import model.kinhnghiem;

/**
 * Servlet implementation class GetKinhNghiemByIdKn
 */
@WebServlet("/GetKinhNghiemByIdKn")
public class GetKinhNghiemByIdKn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idkn");
		String idcv = request.getParameter("idcv");
		KinhnghiemDao dao = new KinhnghiemDao();
		CvDao daocv = new CvDao();
		kinhnghiem kn = dao.getKinhNghiemByIdKn(id);
		cv cv = daocv.getCvbyidcv(idcv);
		if(cv!=null)
		{
			request.setAttribute("idu", cv.getIdu());
		}
		request.setAttribute("kn", kn);
		request.getRequestDispatcher("ShowKn.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
