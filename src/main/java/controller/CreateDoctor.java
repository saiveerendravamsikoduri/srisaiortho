package controller;

import java.io.IOException;

import DAO.DoctorDao;
import Model.DoctorModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateDoctor")
public class CreateDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoctorModel dm=new DoctorModel();
		dm.setId(Integer.parseInt(request.getParameter("doctorid")));
		dm.setName(request.getParameter("doctorname"));
		dm.setQualification(request.getParameter("qulification"));
		dm.setPassword(request.getParameter("password"));
		dm.setExperience(Integer.parseInt(request.getParameter("experience")));
		DoctorDao dd=new DoctorDao();
		boolean t=dd.addDoctor(dm);
		if(t)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
			rd.include(request, response);
		}
	}

}
