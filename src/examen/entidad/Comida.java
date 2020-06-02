package examen.entidad;

import java.io.Serializable;
import javax.persistence.*;



/**
 * Entity implementation class for Entity: Comida
 *
 */
@Entity

public class Comida implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int numero;
	private String nombre;
	private double preciounitario;
	@ManyToOne
	@JoinColumn
	private Pedido pedido;
	

	public Comida() {
		super();
	}
	public Comida(String nombre,double preciounitario,Pedido pedido) {
	super();
	this.nombre = nombre;
	this.preciounitario = preciounitario;
	this.pedido = pedido;
	}
	//geters and seters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPreciounitario() {
		return preciounitario;
	}
	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numero;
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preciounitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Comida other = (Comida) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero != other.numero)
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (Double.doubleToLongBits(preciounitario) != Double.doubleToLongBits(other.preciounitario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comida [numero=" + numero + ", nombre=" + nombre + ", preciounitario=" + preciounitario + ", pedido="
				+ pedido + "]";
	}
	
   
}
