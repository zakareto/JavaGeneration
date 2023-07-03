package colecciones;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


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
	
	
	
	
	
	List<Cliente> listaDeClientes = new ArrayList<>();
	 
	Cliente Felipe= new Cliente("Felipe", "ABC123", 10000.00f, "3921");
	
	
	listaDeClientes.add(Felipe);
	
	listaDeClientes.add(new Cliente("naruto", "XXX111", 100.00f, "0000"));	
	
	
	
	System.out.println(listaDeClientes);
	
	Cliente datoDeLaLista = listaDeClientes.get(0);
	
	System.out.println(datoDeLaLista.getCuentaBancaria());
	
	
	System.out.println(datoDeLaLista);
	
	listaDeClientes.remove(0);
	
	System.out.println(listaDeClientes);
	
	
	Set<String> roomService = new HashSet<>();
	
	roomService.add("chilaquiles");
	roomService.add("agua mineral");
	roomService.add("wi-fi");
	
	
	if (roomService.contains("agua mineral")) {
		System.out.println("obtienes un descuento del 50%");
	}
	
	
	
	System.out.println(roomService);
	
	
	Map<String, Cliente> reservaHabitacion = new HashMap<>();
	
	reservaHabitacion.put("101", new Cliente("jesus", "132asd", 1879.00f,"4253"));
	reservaHabitacion.put("102", new Cliente("bugs", "1421srqd", 1323429.00f,"4386"));
	
	
	
	Cliente reservaBugsBunny= reservaHabitacion.get("102");
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
