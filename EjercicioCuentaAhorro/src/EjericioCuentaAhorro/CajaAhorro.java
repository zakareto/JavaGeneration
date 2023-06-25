package EjericioCuentaAhorro;

public class CajaAhorro {

	//1.atributos
	
	String titular;
	float cantidad;
	
	public CajaAhorro(String titular, float cantidad){
		
	}
	//2.metodos
	
	public void imprimirDatos() {
		 System.out.println("titular: " + titular );
		 System.out.println("cantidad: " + cantidad);
		}
	public String toString() {
		return "CajaAhorro [titular="+titular+", cantidad="+cantidad+"]";
	}
}
