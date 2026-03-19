package actividad_3;


public class Actividad3 {

	private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private int Dni;
    
    public Actividad3() {
	}

    
	public Actividad3(String nombre, String apellido, int edad, boolean casado, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.casado = casado;
		Dni = dni;
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
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}



	
	public String Datos() {
		return "Actividad3 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado=" + casado
				+ ", Dni=" + Dni + "]";
	}
	  
    
	
	
}

