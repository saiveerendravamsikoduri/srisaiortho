package controller;

import java.io.IOException;

import DAO.AdminDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		AdminDao ad=new AdminDao();
		boolean t=ad.cheakAdminLogin(username, password);
		//System.out.println("The t value is "+t);
		if(t)
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
	//		request.setAttribute("username", username);
			RequestDispatcher rd=request.getRequestDispatcher("./assets/jsp/Admin.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
