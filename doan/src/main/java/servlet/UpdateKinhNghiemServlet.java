package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KinhnghiemDao;
import model.kinhnghiem;

/**
 * Servlet implementation class UpdateKinhNghiemServlet
 */
@WebServlet("/UpdateKinhNghiemServlet")
public class UpdateKinhNghiemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idkn = request.getParameter("idkn");
		String nameda = request.getParameter("nameda");
		String kythuat = request.getParameter("kythuat");
		String mota = request.getParameter("mota");
		KinhnghiemDao dao = new KinhnghiemDao();
		dao.UpdateKinhNghiem(idkn, nameda, kythuat, mota);
		kinhnghiem kn = dao.getKinhNghiemByIdKn(idkn);
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
