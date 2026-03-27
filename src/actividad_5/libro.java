package actividad_5;

public class libro {

	private String titulo;
	private String autor;
	private String ISBN;
    private int ejemplares;
    
    
    
	public libro() {
	}
	
	public libro(String titulo, String autor, String iSBN, int ejemplares) {
		this.titulo = titulo.toUpperCase();
		this.autor = autor;
		ISBN = iSBN;
		this.ejemplares = ejemplares;
	}

	public libro(libro copia) {
		this.titulo = copia.titulo;
		this.autor = copia.autor;
		this.ISBN = copia.ISBN;
		this.ejemplares = copia.ejemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toUpperCase();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public String datos() {
		return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", ejemplares=" + ejemplares ;
	}
    
	
	public void prestamo() {
		boolean sepudo=false;
		
		if(this.ejemplares>0) {
			ejemplares-=1;
			sepudo=true;
			System.out.println("--Usted se ha prestado un libro--");
			
		}
		if(!sepudo) {
			System.out.println("--Usted no pudo prestar--");			
		}
	}
	
	public void devolucion() {
		System.out.println("--Usted ha hecho una devolucion--");
		ejemplares +=1;
	}
    
    
    
    
	
	
	
	
	
	
	
	
}
