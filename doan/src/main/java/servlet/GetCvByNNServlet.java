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
import dao.NganhNgheDao;
import model.cv;
import model.nganhnghe;

/**
 * Servlet implementation class GetIdNNServlet
 */
@WebServlet("/GetCvByNNServlet")
public class GetCvByNNServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idu = request.getParameter("idu");
		String idnn = request.getParameter("idnn");
		CvDao daocv = new CvDao();
		List<cv> listcv = daocv.GetCvByIdNNIdu(idnn, idu);
			request.setAttribute("listcv", listcv);
			request.setAttribute("idnn", idnn);
			request.getRequestDispatcher("cv_nn.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
