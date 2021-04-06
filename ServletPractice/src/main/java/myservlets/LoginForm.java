package myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher rd;
		String username, password = null;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		if (username.equals("Nikhil")) {
			if (password.equals("12345%")) {
				rd = request.getRequestDispatcher("EnumExample");
				rd.forward(request, response);
			} else {
				System.out.print("Invalid Password!");
				rd = request.getRequestDispatcher("enumeration.html");
				rd.include(request, response);
			}
		} else {
			System.out.println("Username Does not exist! Try again!");
			rd = request.getRequestDispatcher("enumeration.html");
			rd.include(request, response);
		}
	}
	
}
