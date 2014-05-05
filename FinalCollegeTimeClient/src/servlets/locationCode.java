package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codes.CallSESUProxy;
/**
 * Servlet implementation class locationCode
 */
@WebServlet("/locationCode")
public class locationCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public locationCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
	CallSESUProxy proxy = new CallSESUProxy();
	proxy.setEndpoint("http://localhost:8080/FinalCollegeTime/services/callSESU");
	String loc = request.getParameter("state");
	proxy.serve(loc);
	HttpSession sess = request.getSession(true);
	sess.setAttribute("location", loc);
	ServletContext sc= getServletContext();
	sc.setAttribute("location", loc);
	RequestDispatcher rd = request.getRequestDispatcher("locationList.jsp");
	rd.forward(request, response);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
