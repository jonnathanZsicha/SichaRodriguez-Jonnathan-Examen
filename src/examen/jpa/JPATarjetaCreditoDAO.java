package examen.jpa;

import emaxen.dao.TarjetaCreditoDAO;
import examen.entidad.TarjetaCredito;

public class JPATarjetaCreditoDAO extends JPAGenericDAO<TarjetaCredito, Integer> implements TarjetaCreditoDAO{

	public JPATarjetaCreditoDAO() {
		super(TarjetaCredito.class);
		// TODO Auto-generated constructor stub
	}
	

}
