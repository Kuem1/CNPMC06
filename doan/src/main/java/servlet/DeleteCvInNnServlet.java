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
 * Servlet implementation class DeleteCvInNnServlet
 */
@WebServlet("/DeleteCvInNnServlet")
public class DeleteCvInNnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idcv = request.getParameter("idcv");
		String idnn = request.getParameter("idnn");
		String idu = request.getParameter("idu");
//		String namecv = request.getParameter("namecv");
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String phone = request.getParameter("phone");
//		String hobby = request.getParameter("hobby");
//		String dob = request.getParameter("dob");
//		String old = request.getParameter("old");
//		String adress = request.getParameter("adress");
//		String job = request.getParameter("job");
//		String career = request.getParameter("career");
//		String technical = request.getParameter("technical");
//		String gender = request.getParameter("gender");
		
		CvDao daocv = new CvDao();
		daocv.DeleteCvInNN(idcv);
//		daocv.deleteCv(idcv);
//		daocv.InsertCvInNN(idcv, namecv, name, email, phone, hobby, dob, old, adress, job, career, technical, gender, idu);
		List<cv> listcv = daocv.GetCvByIdNNIdu(idnn, idu);
		request.setAttribute("listcv", listcv);
		request.setAttribute("idnn", idnn);
		request.getRequestDispatcher("cv_nn.jsp").forward(request, response);
		}
		
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
