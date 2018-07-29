package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<body bgcolor=Purple>");
			out.println("<h2>USER ACCOUNT</h2><hr>");
			
			
			
			
			HttpSession session=request.getSession();
			out.println("<body bgcolor=cyan>");
			
			String p1=request.getParameter("uid");
			out.println("Hello "+p1+". Tell us where you volunteer!<br><br>");
			out.println("<form action=EventInfo> <h2>");
			out.println("Volunteering interests <input type=text name=u1 size=30><br>");
			out.println("ZipCode<input type=text name=u2 size=30><br>");
			out.println("<input type=submit value=SUBMIT>");
			out.println("</form></html>");
		}
	 //Shows database
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
