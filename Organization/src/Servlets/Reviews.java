package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Enumeration;

import JDBC.DAO;
import JDBC.OrgRev;
import JDBC.ReviewDAO;


@WebServlet("/Reviews")
public class Reviews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<h2>Reviews</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String p1=request.getParameter("orgname");
		String p2=request.getParameter("review");
		String p3=request.getParameter("star");
		
	
		session.setAttribute("OrgName", p1);
		session.setAttribute("Review", p2);
		session.setAttribute("Stars", p3);
		
		try {
			
		String x1=String.valueOf(p1);
		String x2=String.valueOf(p2);
		Integer x3=Integer.parseInt(p3);
		System.out.println(x1+" "+x2+" "+x3);
		out.println("Review for "+x1+" created"+"-"+x2+" "+x3);

		DAO dao=new ReviewDAO();
		OrgRev review=new OrgRev(x1,x2,x3);
		dao.saveReview(review);
		System.out.println("DB saved");
		} catch (Exception e) {
			System.err.println("block  failed");
			 out.println("Error:Enter word, word");
	
			
			/*out.println("Error:Enter word, word");
			out.println("<form action=CreateUser1> <h2>");
			out.println("<input type=submit value=GoBack>");
			out.println("</form></html>");*/
		}
		
		out.println("<html>");
		out.println("<form action=Home.html> <h2>");
		out.println("<input type=submit value=HOME>");
		out.println("</form></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
