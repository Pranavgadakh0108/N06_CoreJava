package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		PrintWriter out =resp.getWriter();
		if(myEmail.equals("pranavgadakh@gmail.com") && myPass.equals("pranav123"))
		{
			System.out.println("Success..");
			out.println("Login Successfully!!!");
		}
		else
		{
			System.out.println("Incorrect Input..");
			out.println("Invalid Credientials..!!!");
		}
	}

}
