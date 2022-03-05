package cuentasBanco;

public class Main {

	public static void main(String[] args) {
		CCuenta cuentaPersonal;

		cuentaPersonal = new CCuenta("Antonio L�pez", "1000-2365-85-1230456789", 2500, 0);
		operativaCuenta(cuentaPersonal, 0.0f);
	}

	public static void operativaCuenta(CCuenta cuentaPersonal, float cantidad) {
		double saldoActual;
		saldoActual = cuentaPersonal.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuentaPersonal.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuentaPersonal.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
