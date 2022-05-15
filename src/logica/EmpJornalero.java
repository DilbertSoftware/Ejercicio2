package logica;

public class EmpJornalero extends Empleado {
	private double valorHora;
	private double horas;
	public EmpJornalero(String nombre, String apellido, int numeroBPS, int funcionario, String direccion, String telefono,
			double valorHora, double horas) {
		super(nombre, apellido, numeroBPS, funcionario, direccion, telefono);
		this.valorHora = valorHora;
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return super.toString()+" valorHora=" + valorHora + ", horas=" + horas + "]";
	}
	@Override
	public boolean equals(Object obj) {
		boolean valido=false;
		if(obj!=null && obj instanceof EmpJornalero)
		{
			EmpJornalero empleado=(EmpJornalero)obj;
			if(empleado.getNumeroBPS()==this.getNumeroBPS())
			{
				valido=true;
			}
		}
		return valido;
	}
	
	public double getSueldo()
	{
		return  valorHora * horas;
	}
}
