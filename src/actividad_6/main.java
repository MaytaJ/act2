package actividad_6;

public class main {

	public static void main(String[] args) {
		persona Persona1 = new persona("Juan", "Perez", "juanperez@gmail.com", "1154123383", "avenida 3021");
		estudiante Estudiante1 = new estudiante("Maria", "Gomez", "maria@gmail.com", "123456789", "Calle 123", "A001","2024", "Sistemas", 5);

		
		System.out.println(Estudiante1.Datos());
		
	}

}
