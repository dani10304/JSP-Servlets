package com.teoria.restaurante;


import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teoria.restaurante.model.Menu;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String dia=request.getParameter("dia");
		/*if(dia.equalsIgnoreCase("lunes")) {
			response.getWriter().append("hoy es lunes");
		} else {
			response.getWriter().append("hoy NO es lunes");
		}*/
		
		/*Decidir la estructura de datos
		 interface Collection - interface List - interface Set : index 0,1,2...
		 interface Map (Dictionary) - key value :lunes-menu1
		 
		 HashMap - TreeMap (nodos) - HashTable (hilos)
		 */
		HashMap<String, Menu>hm=new HashMap<>();
		hm.put("lunes", new Menu("arroz","agua","manzana",19.95f));
		hm.put("martes", new Menu("macarrones","agua","manzana",19.95f));
		hm.put("miercoles", new Menu("ensalada","vino","manzana",19.95f));
		hm.put("jueves", new Menu("pollo","agua","manzana",19.95f));
		hm.put("viernes", new Menu("sopa","agua","pera",19.95f));
		
		//mostrar todos los menus
		/*hm.forEach((k,v)->{
			try {
				response.getWriter().append(k.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		*/
		hm.keySet().stream().filter(k->k.equalsIgnoreCase(dia)).findFirst().ifPresent(k->{
			try {
				response.getWriter().append(hm.get(k).getComida()+"-");
				response.getWriter().append(hm.get(k).getBebida()+"-");
				response.getWriter().append(hm.get(k).getPostre()+"-");
				response.getWriter().append(hm.get(k).getPrecio()+"-");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});//cierra ifPresent
		
		
		
		
		
		
	}//cierra doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
