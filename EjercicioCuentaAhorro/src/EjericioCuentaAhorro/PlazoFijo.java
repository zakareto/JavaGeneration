package EjericioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	public int plazo;
	public double interes;
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes= interes;
		
	}

	
	//metodo obtener importe de interes
	public double obtenerImporteInteres() {
		return cantidad*(interes/100);
	}
	
	
	//metodo para mostrarInformacion
	public void mostrarInformacion() {
		System.out.println("informacion de la cuenta plazo fijo");
		imprimirDatos();
		System.out.println("Plazo: "+plazo);
		System.out.println("interes: "+interes);
		System.out.println("total de interes: "+obtenerImporteInteres());
	}
}


