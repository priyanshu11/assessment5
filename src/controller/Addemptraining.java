package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;

import modal.Employees;
import modal.Performance;



/**
 * Servlet implementation class Addemptraining
 */
@WebServlet("/addemptraining")
public class Addemptraining extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addemptraining() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDao eDao= new EmployeeDao();
		List<Employees> employee = eDao.findAll();
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("employeename");
		
		String email = request.getParameter("uname");
		
		String tbatc= request.getParameter("batch");
		String  perf = request.getParameter("performance");
		
		Employees e = new Employees(name,email,tbatc,perf);
	
		EmployeeDao eDao = new EmployeeDao();
		eDao.create(e);
		request.getSession().setAttribute("employee", e);
		response.sendRedirect("index.jsp");
	}

}
