package entidades;

public class Test {

	public static void main(String[] args) {
		Empleado evilFelipe = new Empleado("Evil Felipe",31,"Evifelipe@gmail.com", "1231241552", "abc123","931283918", "bell boy");
		
		 evilFelipe.mostrarInformacion();
		 
		 Persona naruto = new Persona("Naruto", 30, "naruto@gmail.com", "523423523");
		 naruto.mostrarInformacion();
		 
		 
		 
		 System.out.println("impresion de objetos");
		 System.out.println(evilFelipe);
		 
		 
		 System.out.println();
		 System.out.println("instancia cliente");
		 
		 
		 Cliente Jesus = new Cliente ("jesus", "abcd1234", 157654.00f, "1234");
		 
		 Jesus.mostrarInfoCliente();
		 
		 Jesus.nombre= "felipe";
		 Jesus.setSaldo(1212.0f);
		 Jesus.setCuentaBancaria("");
		 
	}
	
	
}
