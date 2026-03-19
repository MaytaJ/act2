package actividad_2;

public class Trabajo2 {

	String marca;
	String modelo;
	String nombreDuenio;

	boolean estaEncendido;
	boolean estaAbierto;
	boolean estaVacio = true;

	int kilometraje = 0;
	int nivelCombustible = 0;

	public Trabajo2(String marca, String modelo, String nombreDuenio) {
		this.marca = marca;
		this.modelo = modelo;
		this.nombreDuenio = nombreDuenio;
		this.estaEncendido = estaEncendido;
		this.kilometraje = kilometraje;
		this.nivelCombustible = nivelCombustible;
	}

	public void llenarTanque() {
		System.out.println("Ah llenado el tanque del auto");
		estaVacio = false;
		nivelCombustible = 100;
	}

	public void encender() {

		if (estaVacio == true || nivelCombustible == 0) {
			System.out.println("Sin nafta, no puede encender");
		} else {
			System.out.println("Esta encendido");
			estaEncendido = true;
		}

	}

	public void avanzar() {

		if (estaEncendido == true && estaVacio == false) {
			System.out.println("Esta avanzando");
			kilometraje += 10;
			nivelCombustible -= 20;
		} else {
			System.out.println("No puede avanzar: el auto está apagado o sin nafta.");
		}

	}

	public void abrirPuertas() {

		if (estaEncendido == false) {
			System.out.println("abrio la puerta");
		} else {
			System.out.println("Usted no pudo abrir la puerta ");
		}

	}

	public String mostrarEstado() {
		return "Trabajo2 [marca=" + marca + ", modelo=" + modelo + ", nombreDuenio=" + nombreDuenio + ", estaEncendido="
				+ estaEncendido + ", estaAbierto=" + estaAbierto + ", estaVacio=" + estaVacio + ", kilometraje="
				+ kilometraje + ", nivelCombustible=" + nivelCombustible + "]";

	}

}
