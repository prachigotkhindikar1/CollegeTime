package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codes.CallSESUProxy;
/**
 * Servlet implementation class stepGuide
 */
@WebServlet("/stepGuide")
public class stepGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stepGuide() {
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
		
		PrintWriter out = response.getWriter();
		CallSESUProxy proxy = new CallSESUProxy();
		proxy.setEndpoint("http://localhost:8080/FinalCollegeTime/services/callSESU");
		int mathScore = Integer.parseInt(request.getParameter("mathScore"));
		int verbalScore = Integer.parseInt(request.getParameter("verbalScore"));
		proxy.scoresservice(mathScore,verbalScore);
		
	}

}
