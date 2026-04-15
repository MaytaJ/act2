package actividad_6;

public class estudiante extends persona {
private String legajo;
private String Ano_ingreso;
private String carrera;
private int materias;


public estudiante(String nombre, String apellido, String email, String telefono, String direccion, String legajo,
		String ano_ingreso, String carrera, int materias) {
	super(nombre, apellido, email, telefono, direccion);
	this.legajo = legajo;
	this.Ano_ingreso = ano_ingreso;
	this.carrera = carrera;
	this.materias = materias;
}
public String getLegajo() {
	return legajo;
}
public void setLegajo(String legajo) {
	this.legajo = legajo;
}
public String getAno_ingreso() {
	return Ano_ingreso;
}
public void setAno_ingreso(String ano_ingreso) {
	this.Ano_ingreso = ano_ingreso;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public int getMaterias() {
	return materias;
}
public void setMaterias(int materias) {
	this.materias = materias;
}


@Override
public String Datos() {
    return super.Datos() +
           ", legajo=" + legajo +
           ", año ingreso=" + Ano_ingreso +
           ", carrera=" + carrera +
           ", materias=" + materias;
}


	
	
	

}
