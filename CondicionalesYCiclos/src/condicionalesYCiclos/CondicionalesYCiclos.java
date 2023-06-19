package condicionalesYCiclos;
import java.util.Scanner;
public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Condicionales
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 */
		
		
		System.out.println("Programa para calcular la hora");
		
		
		//equivalente al prompt en js se llama scanner
		
		
		//var hora = prompt("mensaje") 
		
		
		
		Scanner valorIngresado = new Scanner(System.in);
		System.out.println("por favor ingrse una hora");
		
//		int valorIngresado = hora.nextInt();
//		if(valorIngresado>= 0 && valorIngresado<= 24) {
//			System.out.println("Buenos dias solecito");
			
//		}
		
		int hora = valorIngresado.nextInt();
		
		if(hora>=0 && hora<=23)
		{
			
			if(hora>= 0 && hora<= 11) {
				System.out.println("Buenos dias solecito");
			}else if(hora>=12 && hora<=18) {
			System.out.println("buenas tardes ya");
			}else if(hora>=19 && hora<24){
			System.out.println("buenas noches");
			}else {
			System.out.println("madrugada");
			}
			
		} else {
			System.out.println("hora mal ingresada");
		}
		valorIngresado.close();
		
		
		int opcion =1;
		switch(opcion) {
		case 1:
			System.out.println("bienvenido al servicio de reserva");
			break;
		case 2:
			System.out.println("bienvenido al servicio de check-in");
			break;
		case 3:
			System.out.println("bienvenido al servicio de check-out");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}
		
		int entradaDeDato = 5;
		
//		switch(entradaDeDato) {
//		case 1:
//			switch(otraOpcion) {
//			case 1:
//				System.out.println("Esta Es la primera opcion del primer caso")
//				break;
//			case 2:
//				System.out.println("Esta Es la segunda opcion del primer caso")
//				break;
//			}
//		}
		
		
		
		
		
		

	}
	
	

}
