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
import emaxen.dao.TarjetaCreditoDAO;
import examen.entidad.TarjetaCredito;

/**
 * Servlet implementation class RegistrarTarjeta
 */
@WebServlet("/RegistrarTarjeta")
public class RegistrarTarjeta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date fec;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarTarjeta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		TarjetaCreditoDAO tajetadao = DAOFactory.getFactory().getTarjetaCreditoDAO();
		
		
		
		SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
		 try {
			fec = formato.parse("2024/01/23");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TarjetaCredito tarjeta = new TarjetaCredito(1, "1010-1010", "Jonnathan Sicha", fec, 180, null);
		tajetadao.create(tarjeta);
		TarjetaCredito tarjeta1 = new TarjetaCredito(2, "2010-2010", "Daniel Rodriguez", fec, 190, null);
		tajetadao.create(tarjeta1);
		TarjetaCredito tarjeta2 = new TarjetaCredito(3, "3010-3010", "Juan Saltos", fec, 200, null);
		tajetadao.create(tarjeta2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
