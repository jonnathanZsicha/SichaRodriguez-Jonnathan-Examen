package examen.jpa;

import emaxen.dao.ComidaDAO;
import examen.entidad.Comida;

public class JPAComidaDAO extends JPAGenericDAO<Comida, Integer> implements ComidaDAO{

	public JPAComidaDAO() {
		super(Comida.class);
		// TODO Auto-generated constructor stub
	}

}
