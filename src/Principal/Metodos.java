package Principal;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {
		
		String userGeneral = JOptionPane.showInputDialog("Responda con Honestidad:\n"
				+ "Si es un usuario nuevo escriba --> n\n"
				+ "Si es un obrero escriba --> o");
		
		if(userGeneral.equalsIgnoreCase("n")) {
			System.out.println("*******************************************\n");
			System.out.println("BIENVENIDO A IMPRESS++\n");
			System.out.println("*******************************************\n");
			String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
			System.out.println("Bienvenido "+nombre+", te pedimos por favor completes"
					+ " las preguntas.");
			String dni = JOptionPane.showInputDialog("Ingrese su DNI:");
			String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
			String direccion = JOptionPane.showInputDialog("Ingrese su direccion:");
			
			Persona usuario1 = new Persona(dni,nombre,apellido,direccion);
			System.out.println("Sus datos se registraron con exio. \n ========================>");
			System.out.println(usuario1.mostrarDatos());
			JOptionPane.showMessageDialog(null, "Registro finalizado.");
		}else {
			if(userGeneral.equalsIgnoreCase("o")) {
				System.out.println("*********************************************\n");
				System.out.println("BIENVENIDO A IMPRESS++\n");
				System.out.println("*********************************************\n");
				String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
				String dni = JOptionPane.showInputDialog("Ingrese su DNI: ");
				String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
				String direccion = JOptionPane.showInputDialog("Ingrese de direccion:");
				String area = JOptionPane.showInputDialog("Ingrese su area:");
				String cargo = JOptionPane.showInputDialog("Ingrese su cargo:");
				String sueldo = JOptionPane.showInputDialog("Ingrese su sueldo:"); 
				Float fSueldo = new Float(sueldo); // Convierte el String -> float
				//fSueldo = Float.parseFloat(sueldo);
								
				Obrero usuario2 = new Obrero(dni,nombre,apellido,direccion,area,cargo);
				usuario2.setSueldo(fSueldo);
				System.out.println("Sus datos se registraron con exio.\n========================>\n\n");
				System.out.println(usuario2.MostrarDatos());
				NumeroRound numero = new NumeroRound(528.56);
				numero.redondeoNum(15.20);
				numero.redondeoNum(15.25f);
				JOptionPane.showMessageDialog(null, "Registro finalizado.");
			}else {
				JOptionPane.showMessageDialog(null,"Gracias por su visita.");
			}
		}

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
	
	// Metodo
	public String mostrarDatos() {
		return "DNI: "+getDni()+"\nNOMBRE: "+getNombre()+"\nAPELLIDO: "+getApellido()
		+"\nDIRECCION: "+getDireccion();
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
		return "DNI: "+super.getDni()+"\nNombre: "+super.getNombre()+"\nApellido: "+super.getApellido()
		+"\nDireccion: "+super.getDireccion()+"\nArea: "+getArea()+"\nCargo: "+getCargo()+"\nSueldo: "+getSueldo();
	}
}