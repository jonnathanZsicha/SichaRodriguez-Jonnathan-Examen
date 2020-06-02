package emaxen.dao;

import java.util.List;
import java.util.Set;







public interface GenericDAO <T,ID> {
	
	public void create(T entity);

	public T read(ID id);
	
	public List<T> readAll();

	public void update(T entity);

	public void delete(T entity);
	
	public void deleteByID(ID id);
	
	public List<T> findCorreo(String[] attributes, String[] values); // like + and
	




}
