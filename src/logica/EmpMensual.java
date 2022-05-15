package logica;

public class EmpMensual extends Empleado {
	private double salario;
	private String tipoRegimen;
	
	public EmpMensual(String nombre, String apellido, int numeroBPS, int funcionario, String direccion,
			String telefono, double salario,String tipoRegimen) {
		super(nombre, apellido, numeroBPS, funcionario, direccion, telefono);
		this.salario=salario;
		this.tipoRegimen=tipoRegimen;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

	@Override
	public String toString() {
		return super.toString()+"salario=" + salario + ", tipoRegimen=" + tipoRegimen ;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean valido=false;
		if(obj!=null && obj instanceof EmpMensual)
		{
			EmpMensual empleado=(EmpMensual)obj;
			if(empleado.getNumeroBPS()==this.getNumeroBPS())
			{
				valido=true;
			}
		}
		return valido;
	}
	public double getSueldo()
	{
		return  salario;
	}
}
