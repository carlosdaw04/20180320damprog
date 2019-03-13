package examen.ejercicio1;

public class Empleados {

	private String nombre;
	private String apellidos;
	private String fecha_contratacion;
	private int n_cuenta;
	
	public Empleados(String nombre, String apellidos, String fecha_contratacion, int n_cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_contratacion = fecha_contratacion;
		this.n_cuenta = n_cuenta;
	}
	
	public int getN_cuenta() {
		return n_cuenta;
	}
	
	public void setN_cuenta(int n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getFecha_contratacion() {
		return fecha_contratacion;
	}

}
