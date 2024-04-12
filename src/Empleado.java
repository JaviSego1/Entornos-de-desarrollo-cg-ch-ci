

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


	/**
	 * Constructor para crear un empleado con todos los detalles.
	 *
	 * @param emp_no   Número de empleado.
	 * @param nombre   Nombre del empleado.
	 * @param apellido Apellido del empleado.
	 * @param pobla    Lugar de nacimiento del empleado.
	 * @param oficio   Oficio del empleado.
	 * @param salario  Salario del empleado.
	 * @param dept     Departamento del empleado.
	 */

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


	/**
	 * Constructor para crear un empleado con los detalles básicos.
	 *
	 * @param emp_no  Número de empleado.
	 * @param nombre  Nombre del empleado.
	 * @param salario Salario del empleado.
	 * @param dept    Departamento del empleado.
	 */

	public Empleado(int emp_no, String nombre, Double salario, String dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}


	/**
	 * Obtiene el número de empleado.
	 *
	 * @return El número de empleado.
	 */

	public int getEmp_no() {
		return emp_no;
	}


	/**
	 * Establece el número de empleado.
	 *
	 * @param emp_no El número de empleado a establecer.
	 */

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}


	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Establece el nombre del empleado.
	 *
	 * @param nombre El nombre del empleado a establecer.
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Obtiene el lugar de nacimiento del empleado.
	 *
	 * @return El lugar de nacimiento del empleado.
	 */

	public String getPobla() {
		return pobla;
	}


	/**
	 * Establece el lugar de nacimiento del empleado.
	 *
	 * @param pobla El lugar de nacimiento del empleado a establecer.
	 */

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}


	/**
	 * Obtiene el oficio del empleado.
	 *
	 * @return El oficio del empleado.
	 */

	public String getOficio() {
		return oficio;
	}


	/**
	 * Establece el oficio del empleado.
	 *
	 * @param oficio El oficio del empleado a establecer.
	 */

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}


	/**
	 * Obtiene el salario del empleado.
	 *
	 * @return El salario del empleado.
	 */

	public Double getSalario() {
		return salario;
	}


	/**
	 * Establece el salario del empleado.
	 *
	 * @param salario El salario del empleado a establecer. Debe ser un valor no negativo.
	 * @throws IllegalArgumentException Si se proporciona un salario negativo.
	 */
	public void setSalario(Double salario) throws IllegalArgumentException {
		if (salario < 0) {
			throw new IllegalArgumentException("El salario no puede ser negativo.");
		}
		this.salario = salario;
	}


	/**
	 * Obtiene el departamento del empleado.
	 *
	 * @return El departamento del empleado.
	 */

	public String getDept() {
		return dept;
	}


	/**
	 * Establece el departamento del empleado.
	 *
	 * @param dept El departamento del empleado a establecer.
	 */

	public void setDept(String dept) {
		this.dept = dept;
	}


	/**
	 * Incrementa el salario del empleado en una cantidad específica.
	 *
	 * @param subida La cantidad en la que se incrementa el salario.
	 */

	public void subidasalario(Double subida) {
		salario = salario + subida;
	}


	/**
	 * Comprueba si el nombre del empleado está vacío.
	 *
	 * @return true si el nombre no está vacío, false de lo contrario.
	 */

	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}