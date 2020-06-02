package examen.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emaxen.dao.DAOFactory;
import emaxen.dao.PedidoDAO;
import examen.entidad.Pedido;

/**
 * Servlet implementation class RegistrarPedido
 */
@WebServlet("/RegistrarPedido")
public class RegistrarPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Date fec;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PedidoDAO pedidoDAO = DAOFactory.getFactory().getPedidoDAO();
		double tota = Double.parseDouble(request.getParameter("total"));
		SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
		 try {
			fec = formato.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tarjeta = request.getParameter("tarjeta");
		
		Pedido pedido = new Pedido(fec,request.getParameter("nombre") ,tota, request.getParameter("observaciones"));
		pedidoDAO.create(pedido);
		System.out.println("Se ha creado exitosamente el pedido");
		
		
		request.getRequestDispatcher( "/JSP/listado.jsp" ).forward( request, response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
