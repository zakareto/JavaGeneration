package EjercicioPOOProductoConsumidor;

public class Consumidor extends producto{
	
	public Consumidor(String nombreLibro, String genero, double precio) {
		super(nombreLibro, genero, precio);
	}
	
	
	public void mostrarDatosConsumidor() {
		mostrarInformacion();
	}
	
	public void informacionDescuento(double descuento) {
		System.out.println("el descuento a aplicar es de" + descuento);
	}
	
	public static void main(String[] args) {
		Consumidor Felipollo = new Consumidor("la biblia", "biblico", 100.0d);
		Felipollo.mostrarDatosConsumidor();
		
		Felipollo.informacionDescuento(.15);
		Felipollo.aplicarDescuento(.15);
		
		
	}
	
	
	
}
