package servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteKnServlet")
public class DeleteKnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idkn");
		KinhnghiemDao dao = new KinhnghiemDao();
		dao.DeleteKn(id);
		String idcv = request.getParameter("idcv");
	    List<kinhnghiem> list = dao.getKinhNghiemById(idcv);
	    request.setAttribute("Listkn", list);
	    request.setAttribute("idcv", idcv);
	    request.getRequestDispatcher("ShowKn.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
