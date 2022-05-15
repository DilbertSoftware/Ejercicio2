package presentacion;

import logica.EmpJornalero;
import logica.EmpMensual;
import logica.Sucursal;

public class Principal {

	public static void main(String[] args) {
		try
		{
		Sucursal suc1=new Sucursal(1,"259142368838","Casa Central","Montevideo","28082888");
		Sucursal suc2=new Sucursal(3,"248648282536","Casa Durazno","Durazno","25823698");
		EmpJornalero jornalero1=new EmpJornalero("Juan", "Zabala", 328672, 68, "Durazno", "328672", 215.5, 120);
		EmpJornalero jornalero2=new EmpJornalero("Pedro", "Rosen", 669825, 30, "Montevideo", "2852639", 280, 100.5);
		EmpMensual mensual1=new EmpMensual("Romina", "Paito", 333458, 50, "Durazno", "2528655", 38000, "Comercial");
		EmpMensual mensual2=new EmpMensual("Lucas", "Manzi", 225698, 45, "Montevideo", "2528655", 38500, "Comercial");
		
		suc1.agregar(jornalero2);
		suc1.agregar(mensual2);
		
		suc2.agregar(mensual1);
		suc2.agregar(jornalero1);
		
		double sueldo=suc1.totalSueldo();
		System.out.println("Gastos por conceptos de Sueldo Sucursal 1 ­ "+sueldo+", donde "+sueldo+" es el monto"
				+ "del cálculo del sueldo de los empleados");
		
		sueldo=suc2.totalSueldo();
		System.out.println("Gastos por conceptos de Sueldo Sucursal 2 ­ "+sueldo+", donde "+sueldo+" es el monto"
				+ "del cálculo del sueldo de los empleados");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
