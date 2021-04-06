package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String passw = request.getParameter("password");
		if(uname.equals("Nikhil") && passw.equals("12345%")) {			
			Random r = new Random();
			Integer ID = r.nextInt(1000);
			out.println("<p>Login Successful!<p>");
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("id", ID);
			out.println("<br><a href='SessionServlet2'>Proceed to next Servlet<a>");
			out.println("<br><a href='session.html'>Back</a>");
			out.close();
		} else {
			out.print("Invalid Credentials!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
