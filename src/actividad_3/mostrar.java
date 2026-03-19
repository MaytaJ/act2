package actividad_3;

public class mostrar {

	public static void main(String[] args) {

		
		Actividad3 p1 = new Actividad3("Juan", "mayta", 16, false, 49093118);
		Actividad3 p2 = new Actividad3("Ivan", "Buhajeruk", 25, true, 40555666); // Spreen
		Actividad3 p3 = new Actividad3("Wos", "Oliva", 28, true, 38111222);
		
		
		p1.setNombre("Mayta");
		p1.setEdad(17);
		p1.setCasado(true);
		
		System.out.println("----Datos modificados---");
		System.out.println(p1.Datos());
		System.out.println(p2.Datos());
		System.out.println(p3.Datos());
		System.out.println("El nombre de la persona 2 es: " + p2.getNombre());
		
	
	}

	
	
	
	
}
