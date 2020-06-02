package examen.jpa;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.mysql.cj.Query;

import emaxen.dao.GenericDAO;




public class JPAGenericDAO <T,ID> implements GenericDAO <T,ID>{

	 private Class<T> persistentClass;
	 protected EntityManager em;

	    public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		
	    }
	    
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>>EROR : JPAGenericDAO :create " + e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
	
		try {
			em.merge(entity);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		    
		}
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
		    em.remove(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}
	
	@Override
	public List<T> findCorreo(String[] attributes, String[] values) {
		// TODO Auto-generated method stub
		// Se crea un criterio de consulta
		List<T> lista = null;
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
		
		// Se establece la clausula FROM
		Root<T> root = criteriaQuery.from(this.persistentClass);
		
		javax.persistence.criteria.Predicate predicate = criteriaBuilder.conjunction();
		
		for (int i = 0; i < attributes.length;i++) {
		    javax.persistence.criteria.Predicate sig = criteriaBuilder.like(root.get(attributes[i]), values[i]);
		    
		    // Predicate sig =
		    // criteriaBuilder.like(root.get(attributes[i]).as(String.class),
		    // values[i]);
		    predicate = criteriaBuilder.and(predicate, sig);
		 
			 // el
			 // resultado
		}
		     // Se establece el WHERE
		criteriaQuery.where(predicate);
					 // Se realiza la query
	
		System.out.println(criteriaQuery.where(predicate));
				   
		lista =em.createQuery(criteriaQuery).getResultList();
		return lista;// Se
					 // crea					
	}

	@Override
	public List<T> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
		
	}



}
