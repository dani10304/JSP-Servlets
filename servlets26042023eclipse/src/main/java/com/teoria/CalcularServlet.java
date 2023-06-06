package com.teoria;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularServlet
 */
@WebServlet("/CalcularServlet")
public class CalcularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre=request.getParameter("nombre");
		int clases=Integer.parseInt(request.getParameter("clases"));
		String perfil=request.getParameter("perfil");
		int competiciones=Integer.parseInt(request.getParameter("competiciones"));
		response.getWriter().append("<h2>Detalle de cuota</h2>");
		int total_clases=clases*9;
		int total_competiciones=competiciones*15;
		int cuota_total=total_clases+total_competiciones;
		response.getWriter().append("Cuota mensual "+cuota_total);
	}

}
