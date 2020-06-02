package emaxen.dao;

import examen.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	//es mejor inyeccion de objetos
	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
		
	}
	public abstract PedidoDAO getPedidoDAO();
	
	public abstract ComidaDAO getComidaDAO();
	
	public abstract TarjetaCreditoDAO getTarjetaCreditoDAO();
	

}
