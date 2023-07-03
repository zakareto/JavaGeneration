package abstraccion;

public abstract class Vehiculo{

	
	public String marca;
	public int anio;
	
	//metodo concreto
	public void mostrarInfo() {
		System.out.println("mi auto es: " +marca + "y es del año: " + anio);
	}
	
	public abstract void acelerar();
	
	public abstract void frenar();
	
	
	
}
