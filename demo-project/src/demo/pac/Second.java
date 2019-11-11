package demo.pac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
// @WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// HttpSession session = request.getSession();

		User user = new User();
		user.setEmail(request.getParameter("email"));
		user.setPhone( request.getParameter("phone"));
		request.setAttribute("us", user);

		response.sendRedirect("final.jsp");
		// RequestDispatcher rd = request.getRequestDispatcher("final.jsp");
		// rd.forward(request, response);

	}

}
// <%@ page import="javax.servlet.http.HttpSession" %>