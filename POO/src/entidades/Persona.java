package entidades;

public class Persona {
	
	
	//propiedades o atributos
	
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
		
	}
	
	
	//sobrecarga
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	
	
	
	
	public void mostrarInformacion() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("correo: " + this.correo);
		System.out.println("telefono: " + this.telefono);
	}
	
	
	public float conversor(float conversionDolar) {
	 float dolar = 16.5f;
	 float conversion = dolar*conversionDolar;
	 return conversion;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia
		Persona Felipe = new Persona("felipe", 31, "Felipe.maqueda@idr.edu.mx", "4124124124");
		Persona Eduardo = new Persona("Eduardo", 31, "eduardo.maqueda@idr.edu.mx", "4124124124");
		Persona Daniel= new Persona("daniel", 31, "daniel.maqueda@idr.edu.mx", "4124124124");
		
	 Felipe.mostrarInformacion();

	}

}
