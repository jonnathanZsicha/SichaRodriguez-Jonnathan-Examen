package examen.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;





/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity

public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int numero;
	private Date fecha;
	private String cliente;
	private double total;
	private String observaciones;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private Set<Comida> comidas ;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "tarjeta")
	private TarjetaCredito tarjeta;

	public Pedido() {
		super();
	}
	public Pedido(Date fecha,String cliente,double total,String observaciones) {
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones= observaciones;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Set<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(Set<Comida> comidas) {
		this.comidas = comidas;
	}
	public void addComidas(Comida comida) {
		this.comidas.add(comida);
	}
	
	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total
				+ ", observaciones=" + observaciones + ", comidas=" + comidas + ", tarjeta=" + tarjeta + "]";
	}
	
	
	
   
}
