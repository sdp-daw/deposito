package cuentasBanco;

/**
 * Esta clase se utiliza para crear una cuenta bancaria y operar con ella.
 * Contiene los datos que conforman la cuenta y lo que se puede hacer con ella.
 * 
 * @author sdp Sergio D�ez Pe�a / 1� DAW a distancia
 * @version 0.1, 2022/03/04
 */
public class CCuenta {

	/**
	 * Atributo que almacena el nombre y apellido del titular de la cuenta.
	 */
	private String nombre;
	/**
	 * Atributo que almacena el n�mero de la cuenta.
	 */
	private String cuenta;
	/**
	 * Atributo que almacena el saldo de la cuenta.
	 */
	private double saldo;
	/**
	 * Atributo que almacena el tipo de inter�s de la cuenta.
	 */
	private double tipoInter�s;

	/**
	 * M�todo que devuelve el valor del nombre y apellido del titular de la cuenta.
	 * 
	 * @return Devuelve un (String) con el nombre y apellido del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Define el nombre y apellido del titular de la cuenta y recibe el par�metro
	 * nombre.
	 * 
	 * @param nombre Par�metro que contiene el nombre y el apellido del titular de
	 *               la cuenta.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que devuelve el valor del n�mero de la cuenta.
	 * 
	 * @return Devuelve un (String) con el n�mero de la cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Define el n�mero de la cuenta y recibe el par�metro cuenta.
	 * 
	 * @param cuenta Par�metro que contiene el n�mero de la cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * M�todo que devuelve el saldo de la cuenta.
	 * 
	 * @return Devuelve un (double) con el saldo cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Define el saldo de la cuenta y recibe el par�metro saldo.
	 * 
	 * @param saldo Par�metro que contiene el saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo que devuelve el tipo de inter�s de la cuenta.
	 * 
	 * @return Devuelve un (double) con el tipo de inter�s cuenta.
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}

	/**
	 * Define el tipo de inter�s de la cuenta y recibe el par�metro tipoInter�s.
	 * 
	 * @param tipoInter�s Par�metro que contiene el tipo de inter�s de la cuenta.
	 */
	void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}

	/**
	 * M�todo constructor por defecto.
	 */
	public CCuenta() {
	}

	/**
	 * M�todo constructor que recibe como par�metros nom, cue, sal y tipo.
	 * 
	 * @param nom  Par�metro (String) que contiene el nombre y el apellido del
	 *             titular de la cuenta.
	 * @param cue  Par�metro (String) que contiene el n�mero de la cuenta.
	 * @param sal  Par�metro (double) que contiene el saldo de la cuenta.
	 * @param tipo Par�metro (double) que contiene el tipo de inter�s de la cuenta.
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * M�todo que informa del estado la cuenta.
	 * 
	 * @return Devuelve el saldo de la cuenta.
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * M�todo para realizar ingresos en cuenta y recibe como par�metro cantidad.
	 * 
	 * @param cantidad Par�metro (double) que contiene la cantidad a ingresar.
	 * @throws Exception Lanza excepci�n en caso de que el par�metro cantidad sea
	 *                   negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * M�todo para realizar retiradas en cuenta y recibe como par�metro cantidad.
	 * 
	 * @param cantidad Par�metro (double) que contiene la cantidad a ingresar.
	 * @throws Exception Lanza excepci�n en el caso de que el par�metro cantidad sea
	 *                   negativa
	 * @throws Exception Lanza excepci�n en el caso de que el par�metro cantidad sea
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
