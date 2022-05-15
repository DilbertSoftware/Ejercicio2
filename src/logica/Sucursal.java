package logica;

import java.util.LinkedList;

public class Sucursal {
	private String nombre;
	private int identificador;
	private String direccion;
	private String telefono;
	private String rut;
	private LinkedList<Empleado> listaEmpleados;
	
	public Sucursal(int identificador, String rut, String nombre, String direccion, String telefono) {
		super();
		this.identificador = identificador;
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		listaEmpleados=new LinkedList<Empleado>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getIdentificador() {
		return identificador;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", identificador=" + identificador + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", rut=" + rut  ;
	}
	
	public void agregar(Empleado empleado) throws Exception
	{
		if(!listaEmpleados.contains(empleado))
			listaEmpleados.add(empleado);
		else
			throw new Exception("El rut esta ingreso");
	}
	public double totalSueldo() {
		double total=0;
		for(Empleado empleado : listaEmpleados)
		{
			total+=empleado.getSueldo();
		}
		return total;
	}
	
}
