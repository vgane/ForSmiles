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
 * Servlet implementation class EventInfo
 */
@WebServlet("/EventInfo")
public class EventInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor=Purple>");
		out.println("<h2>Event Info</h2><hr>");
	
		HttpSession session=request.getSession();
		out.println("<body bgcolor=cyan>");
		
		String p1=request.getParameter("uid");
		out.println("Hello "+p1+". Here is the event below. "
				+ "Ask for a signature to complete the event <br><br>");
		
		out.println("<form action=EventHistory> <h2>");
		out.println("Event Name<input type=text name=u3 size=30><br>");
		out.println("Organization<input type=text name=u4 size=30><br>");
		out.println("Time and Date of Event<input type=text name=u5 size=30><br>");
		out.println("ZipCode<input type=text name=u6 size=30><br>");
		
		out.println("Below is to be filled out by Event Holder:<br><br>");
		out.println("Signature of Event Holder<input type=text name=u7 size=30><br>");
		out.println("Code<input type=text name=u9 size=30><br>");
		out.println("Hours Completed<input type=text name=u8 size=30><br>");

		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
