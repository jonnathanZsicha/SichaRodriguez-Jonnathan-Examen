package examen.jpa;

import emaxen.dao.PedidoDAO;
import examen.entidad.Pedido;

public class JPAPedidoDAO extends JPAGenericDAO<Pedido, Integer> implements PedidoDAO{

	public JPAPedidoDAO() {
		super(Pedido.class);
		// TODO Auto-generated constructor stub
	}

}
