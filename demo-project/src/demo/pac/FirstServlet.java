package demo.pac;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
// @WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
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
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		HttpSession session = request.getSession(true);

		User user = new User();
		session.getId();

		user.setFirstname(request.getParameter("fname").toString());
		user.setLastname(request.getParameter("lname").toString());

		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);

		RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
		rd.include(request, response);

		// user.setFname(fname);
		// session.setAttribute(fname, fname);
		// response.sendRedirect("second.jsp");
		

	}

}
