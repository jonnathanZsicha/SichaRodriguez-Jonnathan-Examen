package examen.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emaxen.dao.ComidaDAO;
import emaxen.dao.DAOFactory;
import examen.entidad.Comida;

/**
 * Servlet implementation class RegistrarComida
 */
@WebServlet("/RegistrarComida")
public class RegistrarComida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarComida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ComidaDAO comidadao = DAOFactory.getFactory().getComidaDAO();
		
		double precio1 = Double.parseDouble("20"); 
		double precio2 = Double.parseDouble("30"); 
		double precio3 = Double.parseDouble("40"); 
			
		Comida comida1 = new Comida("salchipapa",precio1 , null);
		comidadao.create(comida1);
		Comida comida2 = new Comida("broster",precio2 , null);
		comidadao.create(comida2);
		Comida comida3 = new Comida("secodepollo",precio3 , null);
		comidadao.create(comida3);
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
