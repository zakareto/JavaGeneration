package EjericioCuentaAhorro;

public class Cuenta {

	//1.atributos
	String titular;
	float cantidad;
	
	
	
	public Cuenta(String titular, float cantidad) {
	 this.titular=titular;
	 this.cantidad=cantidad;
	}
	
	
	public void imprimirDatos() {
	 System.out.println("titular: " + titular );
	 System.out.println("cantidad: " + cantidad);
	}
	
	
}
