package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KinhnghiemDao;
import model.kinhnghiem;

/**
 * Servlet implementation class LoadKnUserServlet
 */
@WebServlet("/LoadKnUserServlet")
public class LoadKnUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idcv");
		KinhnghiemDao dao = new KinhnghiemDao();
		List<kinhnghiem> list = dao.getKinhNghiemById(id);
		request.setAttribute("Listkn", list);
		request.getRequestDispatcher("KnUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
