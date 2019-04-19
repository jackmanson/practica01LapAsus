package Principal;

public class Metodos {

	public static void main(String[] args) {
		
		System.out.println("*******************************************");
		

	}

}

class Persona{
	
	private String dni = "";
	private String nombre = "";
	private String apellido = "";
	private String direccion = "";
	
	//Constructores
	public Persona(String dni, String nombre, String apellido, String direccion){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	// Getter and Setter
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

class Obrero extends Persona{
	
	private String area = "";
	private String cargo = "";
	private float sueldo = 900f;
	
	//Construcctores
	public Obrero(String dni, String nombre, String apellido, String direccion, String area, String cargo){
		super(dni,nombre,apellido,direccion);
		this.area = area;
		this.cargo = cargo;
	}
	
	public Obrero(String dni, String nombre, String apellido){
		super(dni,nombre,"","");
		this.area = "Produccion";
		this.cargo = "Ayudante";
	}
	
	public Obrero(String dni){
		this(dni,"","","","","");
	}
	
	//Getter and Setter
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public float getSueldo(){
		return sueldo;
	}
	
	public void setSueldo(float sueldo){
		this.sueldo = sueldo;
	}
	
	//Metodos
	public String MostrarDatos(){
		return "DNI: "+super.getDni()+" Nombre: "+super.getNombre()+" Apellido: "+super.getApellido();
	}
}