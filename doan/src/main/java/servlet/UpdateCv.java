package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CvDao;
import model.cv;

/**
 * Servlet implementation class UpdateCv
 */
@WebServlet("/UpdateCv")
public class UpdateCv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String hobby = request.getParameter("hobby");
		String dob = request.getParameter("dob");
		String old = request.getParameter("old");
		String adress = request.getParameter("adress");
		String job = request.getParameter("job");
		String career = request.getParameter("career");
		String technical = request.getParameter("technical");
		String gender = request.getParameter("gender");
		String idnn = request.getParameter("idnn");
		String idcv = request.getParameter("idcv");
		String idu = request.getParameter("idu");
		System.out.print(idcv+ name+ email+ phone+ hobby+ dob+old+adress+job+career+technical+gender+idcv);
		CvDao dao = new CvDao();
		dao.updateCv(idcv, name, email, phone, hobby, dob, old, adress, job, career, technical, gender, idu);;
		cv list = dao.getCvbyidcv(idcv);
		request.setAttribute("cv", list);
		request.getRequestDispatcher("ShowCv.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
