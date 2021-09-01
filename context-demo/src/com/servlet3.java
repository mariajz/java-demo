package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet3
 */
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		out.print("<br/><h1>Accessing Config Parameeter in Servlet 3 </h1>");
		out.print("sql="+ config.getInitParameter("sql"));
		out.print("<br/>message="+ config.getInitParameter("message"));
		
		
		ServletContext context = getServletContext();
		out.print("<br/><h1>Accessing Content Parameeters in servlet3</h1>");
		out.print("Driver name"+ context.getInitParameter("Driver"));
		out.print("<br>URL"+ context.getInitParameter("URL"));
		
	}

}
