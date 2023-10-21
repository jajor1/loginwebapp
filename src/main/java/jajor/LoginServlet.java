package jajor;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(n.equals("admin1") && pwd.equals("admin2")) {
			HttpSession hs=request.getSession();
			hs.setAttribute("uname",  n);
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("Username or password incorrect! Try again!");
			RequestDispatcher rd=request.getRequestDispatcher("input.jsp");
			rd.include(request,  response);
		}
	}

}
