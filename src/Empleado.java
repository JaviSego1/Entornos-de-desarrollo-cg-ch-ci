

/**
 *
 * Esta clase representa a un empleado en el sistema.
 *
 * @author manana
 * @version 1.0.0
 * @since 12/04/2024
 */


public class Empleado {

	/** Número de empleado. */
	private int emp_no;

	/** Nombre del empleado. */
	private String nombre;

	/** Apellido del empleado. */
	private String apellido;

	/** Lugar de nacimiento del empleado. */
	private String pobla;

	/** Oficio del empleado. */
	private String oficio;

	/** Salario del empleado. */
	private Double salario;

	/** Departamento del empleado. */
	private String dept;



	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario, String dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		this.dept = dept;
	}

	public Empleado(int emp_no, String nombre, Double salario, String dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void subidasalario(Double subida) {
		salario = salario + subida;
	}

	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}