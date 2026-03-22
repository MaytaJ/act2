package actividad_4;

public class Banco {

	public static void main(String[] args) {

		logic n1 = new logic("20444555", "Juan", "Pérez", "+5411223344", "juan.perez@mail.com", "Av. Siempre Viva 123",
				"Buenos Aires", "1425", 1234, 'A', "VISA", "4545121234345656", "gold", 0, 0);
		n1.setSaldoEnCuenta(80000);
		System.out.println("---Hola bienvenido al sistema bancario.---");
		System.out.println("Este es su saldo en su cuenta: " + n1.getSaldoEnCuenta());
		n1.CobroMantenimiento();
		n1.ahorroBancario();
		n1.CierreDelMes();

		System.out.println("---Bienvenido a su segundo mes!---");
		System.out.println("Este es su saldo en su cuenta: " + n1.getSaldoEnCuenta());
		n1.setDeudaTarjeta(60000);
		n1.CierreDelMes();
		
		
		System.out.println("Todos su Datos en los ultimos Dos Meses");
		System.out.println(n1.Datos());

	}

}
