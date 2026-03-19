package actividad3_modificado;

public class persona {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private int DNI;

	public persona() {
		super();
	}

	public persona(String nombre, String apellido, int edad, boolean casado, int dNI) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.casado = casado;
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String mostrar() {
		return "persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado=" + casado
				+ ", DNI=" + DNI + "]";
	}

}
