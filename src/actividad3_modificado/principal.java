package actividad3_modificado;

public class principal {

	public static void main(String[] args) {

		persona n1 = new persona();

		persona n2 = new persona("Ivan", "Buhajeruk", 25, true, 40555666);
		
		persona n3 = new persona("Wos", "Oliva", 28, true, 38111222);
		
		n1.setNombre("Juan");
		n1.setApellido("Mayta");
		n1.setEdad(17);

		System.out.println("---Datos no modificados----");
		System.out.println(n1.mostrar());
		System.out.println(n2.mostrar());
		System.out.println(n3.mostrar());

		

		n1.setNombre("alberto");
		n1.setApellido("quispe");
		n1.setEdad(19);

		System.out.println("---Datos modificados----");
		System.out.println(n1.mostrar());
		System.out.println(n2.mostrar());
		System.out.println(n3.mostrar());

	}

}
