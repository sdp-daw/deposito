package cuentasBanco;

/**
 * Esta clase se utiliza para crear una cuenta bancaria y operar con ella.
 * Contiene los datos que conforman la cuenta y lo que se puede hacer con ella.
 * 
 * @author sdp Sergio Díez Peña / 1º DAW a distancia
 * @version 0.1, 2022/03/04
 */
public class CCuenta {

	/**
	 * Atributo que almacena el nombre y apellido del titular de la cuenta.
	 */
	private String nombre;
	/**
	 * Atributo que almacena el número de la cuenta.
	 */
	private String cuenta;
	/**
	 * Atributo que almacena el saldo de la cuenta.
	 */
	private double saldo;
	/**
	 * Atributo que almacena el tipo de interés de la cuenta.
	 */
	private double tipoInterés;

	/**
	 * Método que devuelve el valor del nombre y apellido del titular de la cuenta.
	 * 
	 * @return Devuelve un (String) con el nombre y apellido del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Define el nombre y apellido del titular de la cuenta y recibe el parámetro
	 * nombre.
	 * 
	 * @param nombre Parámetro que contiene el nombre y el apellido del titular de
	 *               la cuenta.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el valor del número de la cuenta.
	 * 
	 * @return Devuelve un (String) con el número de la cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Define el número de la cuenta y recibe el parámetro cuenta.
	 * 
	 * @param cuenta Parámetro que contiene el número de la cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método que devuelve el saldo de la cuenta.
	 * 
	 * @return Devuelve un (double) con el saldo cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Define el saldo de la cuenta y recibe el parámetro saldo.
	 * 
	 * @param saldo Parámetro que contiene el saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que devuelve el tipo de interés de la cuenta.
	 * 
	 * @return Devuelve un (double) con el tipo de interés cuenta.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Define el tipo de interés de la cuenta y recibe el parámetro tipoInterés.
	 * 
	 * @param tipoInterés Parámetro que contiene el tipo de interés de la cuenta.
	 */
	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Método constructor por defecto.
	 */
	public CCuenta() {
	}

	/**
	 * Método constructor que recibe como parámetros nom, cue, sal y tipo.
	 * 
	 * @param nom  Parámetro (String) que contiene el nombre y el apellido del
	 *             titular de la cuenta.
	 * @param cue  Parámetro (String) que contiene el número de la cuenta.
	 * @param sal  Parámetro (double) que contiene el saldo de la cuenta.
	 * @param tipo Parámetro (double) que contiene el tipo de interés de la cuenta.
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Método que informa del estado la cuenta.
	 * 
	 * @return Devuelve el saldo de la cuenta.
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Método para realizar ingresos en cuenta y recibe como parámetro cantidad.
	 * 
	 * @param cantidad Parámetro (double) que contiene la cantidad a ingresar.
	 * @throws Exception Lanza excepción en caso de que el parámetro cantidad sea
	 *                   negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Método para realizar retiradas en cuenta y recibe como parámetro cantidad.
	 * 
	 * @param cantidad Parámetro (double) que contiene la cantidad a ingresar.
	 * @throws Exception Lanza excepción en el caso de que el parámetro cantidad sea
	 *                   negativa
	 * @throws Exception Lanza excepción en el caso de que el parámetro cantidad sea
	 *                   mayor que el saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
