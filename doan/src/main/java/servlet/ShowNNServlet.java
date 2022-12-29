package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NganhNgheDao;
import model.nganhnghe;

/**
 * Servlet implementation class ShowNNServlet
 */
@WebServlet("/ShowNNServlet")
public class ShowNNServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NganhNgheDao dao = new NganhNgheDao();
		List<nganhnghe> list = dao.GetallNN();
		request.setAttribute("listnn", list);
		request.getRequestDispatcher("NN.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
