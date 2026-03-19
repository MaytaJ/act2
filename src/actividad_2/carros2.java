package actividad_2;

public class carros2 {

	public static void main(String[] args) {

		Trabajo2 auto1 = new Trabajo2("Toyota", "nose", "Spreen");

		System.out.println("----Usted intento avanzar----");
		auto1.avanzar();

		System.out.println("----USted lleno el tanque---");
		auto1.llenarTanque();

		System.out.println("----Encendio el auto----");
		auto1.encender();

		System.out.println("Usted avanzo");
		auto1.avanzar();

		System.out.println("Estado del auto");
		System.out.println(auto1.mostrarEstado());
	}

}