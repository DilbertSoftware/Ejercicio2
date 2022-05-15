package logica;

public abstract class Empleado {

	private String nombre;
	private String apellido;
	private int numeroBPS;
	private int funcionario;
	private String direccion;
	private String telefono;
	
	public Empleado(String nombre, String apellido, int numeroBPS, int funcionario, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroBPS = numeroBPS;
		this.funcionario = funcionario;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public int getNumeroBPS() {
		return numeroBPS;
	}

	public int getFuncionario() {
		return funcionario;
	}

	public abstract double getSueldo();
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", numeroBPS=" + numeroBPS + ", funcionario="
				+ funcionario + ", direccion=" + direccion + ", telefono=" + telefono ;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	

}
