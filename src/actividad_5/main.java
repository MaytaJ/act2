package actividad_5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		libro libro1 = new libro("1984", "George Orwell", "978-0451524935", 2);
		libro libro2 = new libro("El Principito", "Antoine de Saint-Exupéry", "978-0156012195", 3);
		libro libro3 = new libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8420412146", 2);
		libro libro4 = new libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "978-8478884451", 2);
		libro libro5 = new libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "978-1400034956", 2);
		libro copia1 = new libro(libro1);
		libro copia2 = new libro(libro2);
		libro copia3 = new libro(libro3);
		libro copia4 = new libro(libro4);
		libro copia5 = new libro(libro5);
		copia1.prestamo();
		copia1.devolucion();
		System.out.println("Ingrese el titulo a cambiar de la copia : ");
		copia1.setTitulo(teclado.nextLine());
		System.out.println("--El titulo se modifico correctamente--");
		
		System.out.println(copia1.datos());
		System.out.println(copia2.datos());
		System.out.println(copia3.datos());
		System.out.println(copia4.datos());
		System.out.println(copia5.datos());

		
		

	}

}
