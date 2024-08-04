package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		String myage = req.getParameter("age");
		String mygender = req.getParameter("gender");
		String mydate = req.getParameter("date");
		String mycity = req.getParameter("city");
		String myfile = req.getParameter("ID");
		
		System.out.println("Name: "+myname);
		System.out.println("Email: "+myemail);
		System.out.println("Password: "+mypass);
		System.out.println("Age: "+myage);
		System.out.println("Gender: "+mygender);
		System.out.println("Bdate: "+mydate);
		System.out.println("City: "+mycity);
		System.out.println("File: "+myfile);
		
		PrintWriter out = resp.getWriter();
		out.println("Name: "+myname);
		out.println("Email: "+myemail);
		out.println("Password: "+mypass);
		out.println("Age: "+myage);
		out.println("Gender: "+mygender);
		out.println("Bdate: "+mydate);
		out.println("City: "+mycity);
		out.println("FileName: "+myfile);
	}
	
	
}
