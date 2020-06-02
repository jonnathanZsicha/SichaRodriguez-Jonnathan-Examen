package examen.jpa;

import emaxen.dao.ComidaDAO;
import emaxen.dao.DAOFactory;
import emaxen.dao.PedidoDAO;
import emaxen.dao.TarjetaCreditoDAO;

public class JPADAOFactory extends DAOFactory{



	@Override
	public PedidoDAO getPedidoDAO() {
		// TODO Auto-generated method stub
		return new JPAPedidoDAO();
	}

	@Override
	public ComidaDAO getComidaDAO() {
		// TODO Auto-generated method stub
		return new JPAComidaDAO();
	}

	@Override
	public TarjetaCreditoDAO getTarjetaCreditoDAO() {
		// TODO Auto-generated method stub
		return new JPATarjetaCreditoDAO();
	}
}
