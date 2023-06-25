package EjercicioPOOProductoConsumidor;

public class producto {
	//1. definimos atributos
	public String nombreLibro;
	public String genero;
	public double precio;
	
	
	public producto(String nombreLibro, String genero, double precio) {
		this.nombreLibro = nombreLibro;
		this.genero=genero;
		this.precio= precio;

	}
	
	public void mostrarInformacion() {
		System.out.println("informacion:");
		System.out.println("nombre:"+ nombreLibro);
		System.out.println("genero:"+genero);
		System.out.println("precio:"+precio);
		
	}
	
	public void aplicarDescuento(double porcentaje) {
		double descuento = precio *(1-porcentaje);;
		System.out.println("el precio con descuento es:"+ descuento);
		
	}
}
