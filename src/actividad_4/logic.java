package actividad_4;

public class logic {
	private String dni;
    private String nombre;
    private String apellido;

    // Atributos de Contacto
    private String telefono;
    private String email;
    private String direccion;
    private String localidad;
    private String codigoPostal;

    // Atributo de Seguridad
    private int claveSeguridad;

    // Atributo de Categoría (un solo carácter)
    private char claseCliente;

    // Atributos de Tarjeta
    private String tipoTarjeta; // VISA o MASTER
    private String numeroTarjeta;

    // Atributos de Billetera y Finanzas
    private String tipoBilletera; // base, premium, gold, black
    private double saldoEnCuenta;
    private double deudaTarjeta;
    
	public logic() {
	}

	public logic(String dni, String nombre, String apellido, String telefono, String email, String direccion,
			String localidad, String codigoPostal, int claveSeguridad, char claseCliente, String tipoTarjeta,
			String numeroTarjeta, String tipoBilletera, double saldoEnCuenta, double deudaTarjeta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.claveSeguridad = claveSeguridad;
		this.claseCliente = claseCliente;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.tipoBilletera = tipoBilletera;
		this.saldoEnCuenta = saldoEnCuenta;
		this.deudaTarjeta = deudaTarjeta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getClaveSeguridad() {
		return claveSeguridad;
	}

	public void setClaveSeguridad(int claveSeguridad) {
		this.claveSeguridad = claveSeguridad;
	}

	public char getClaseCliente() {
		return claseCliente;
	}

	public void setClaseCliente(char claseCliente) {
		this.claseCliente = claseCliente;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getTipoBilletera() {
		return tipoBilletera;
	}

	public void setTipoBilletera(String tipoBilletera) {
		this.tipoBilletera = tipoBilletera;
	}

	public double getSaldoEnCuenta() {
		return saldoEnCuenta;
	}

	public void setSaldoEnCuenta(double saldoEnCuenta) {
		this.saldoEnCuenta = saldoEnCuenta;
	}

	public double getDeudaTarjeta() {
		return deudaTarjeta;
	}

	public void setDeudaTarjeta(double deudaTarjeta) {
		this.deudaTarjeta = deudaTarjeta;
	}
    
    public void CobroMantenimiento() {
    	System.out.println("------Se le ha cobrado por el uso de la cuenta bancaria-----");
    	deudaTarjeta+=5000;
	}
    public void ahorroBancario() {
    	System.out.println("------Por tener su plata en el banco, se le ha regalado un 10% extra----");
    	saldoEnCuenta*=1.10;  
	}
    public void CierreDelMes() {
    	System.out.println("--Cierre del mes, se le ha restado la deuda de la tarjeta--");
    	saldoEnCuenta-=deudaTarjeta;
    	deudaTarjeta = 0;
    	System.out.println("Usted tiene : "+saldoEnCuenta);   	
	}

	
	public String Datos() {
		return "logic [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", email=" + email + ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal="
				+ codigoPostal + ", claveSeguridad=" + claveSeguridad + ", claseCliente=" + claseCliente
				+ ", tipoTarjeta=" + tipoTarjeta + ", numeroTarjeta=" + numeroTarjeta + ", tipoBilletera="
				+ tipoBilletera + ", saldoEnCuenta=" + saldoEnCuenta + ", deudaTarjeta=" + deudaTarjeta + "]";
	}
    
    
    
    
    
}
