package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eventjdbcHistory.DAOeh;
import eventjdbcHistory.EventHist;
import eventjdbcHistory.EventHistDAO;







/**
 * Servlet implementation class EventHistory
 */
@WebServlet("/EventHistory")
public class EventHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<h2>User Event History</h2><hr>");
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String p1=request.getParameter("u3");
		String p2=request.getParameter("u4");
		String p3=request.getParameter("u5");
		String p4=request.getParameter("u6");
		String p5=request.getParameter("u7");
		String p6=request.getParameter("u8");
		
	
		session.setAttribute("EventName", p1);
		session.setAttribute("OrgName", p2);
		session.setAttribute("Date", p3);
		session.setAttribute("Zipcode", p4);
		session.setAttribute("Signature", p5);
		session.setAttribute("Hours", p6);
		
		try {
			
		String x1=String.valueOf(p1);
		String x2=String.valueOf(p2);
		String x3=String.valueOf(p3);
		Integer x4=Integer.parseInt(p4);
		String x5=String.valueOf(p5);
		Integer x6=Integer.parseInt(p6);
		
		System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6);
		out.println("History for "+x1+" created");
		
		DAOeh dao=new EventHistDAO();
		EventHist his=new EventHist(x1,x2,x3,x4,x5,x6);
		dao.saveHist(his);
		
		System.out.println("DB saved");
		} catch (Exception e) {
			System.err.println("block  failed");
			 out.println("Error:Enter word, word");
	
			
			
		}
		
		out.println("<html>");
		out.println("<form action=Organization.html> <h2>");
		out.println("<input type=submit value=GiveReview>");
		out.println("</form></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
