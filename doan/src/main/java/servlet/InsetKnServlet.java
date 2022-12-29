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
 * Servlet implementation class InsetKnServlet
 */
@WebServlet("/InsetKnServlet")
public class InsetKnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idcv");
		String nameda = request.getParameter("nameda");
		String kythuat = request.getParameter("kythuat");
		String namkn = request.getParameter("namkn");
		String mota = request.getParameter("mota");
		KinhnghiemDao dao = new KinhnghiemDao();
		dao.InsertKn(nameda, kythuat, mota, namkn, id);;
		List<kinhnghiem> list = dao.getKinhNghiemById(id);
		request.setAttribute("Listkn", list);
		request.setAttribute("idcv", id);
		request.getRequestDispatcher("getidcv").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
