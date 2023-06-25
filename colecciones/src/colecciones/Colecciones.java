package colecciones;
import java.util.Set;
import java.util.HashSet;

public class Colecciones {
	
	public static void main(String[] args)
	{
	
		
		
		
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
	
	System.out.println(listaCompras);
	
	for(String productoTemporal : listaCompras) {
		System.out.println(productoTemporal);
	}
	
	String[] habitaciones = new String[10];
	
	habitaciones[0]="101";
	habitaciones[1]="102";
	habitaciones[2]="103";
	habitaciones[3]="104";
	habitaciones[4]="105";
	habitaciones[5]="106";
	habitaciones[6]="107";
	habitaciones[7]="108";
	
	
	System.out.println(habitaciones[8]);
	
	
	
	for(String habitacionTemporal : habitaciones) {
		System.out.println(habitacionTemporal);
	}
	
	
	
	}
	
	
	
	
	
	
	
	
}
