package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		PrintWriter out =resp.getWriter();
		if(myEmail.equals("pranavgadakh@gmail.com") && myPass.equals("1234"))
		{
			System.out.println("Success..");
			
			req.setAttribute("name_key", "Pranav Gadakh");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			System.out.println("Incorrect Input..");
			
			resp.setContentType("text/html");
			
			out.println("<h2 style='color:yellow '>EmaiID & Password can't Match!!!</h2>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
			rd.include(req, resp);
			
		}
	}

}
