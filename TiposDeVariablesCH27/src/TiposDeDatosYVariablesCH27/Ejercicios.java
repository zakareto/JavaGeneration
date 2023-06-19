package TiposDeDatosYVariablesCH27;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	System.out.println("hola mundo");
		
		//tipos de datos
		
		//byte:sirve para representar un valor numerico de 8 bits
		
		//cine java
	byte salas = 10;
	System.out.println(salas);
	
	//short: sirve para un numero de 16 bits
	
	short asientos =1120;
	
	System.out.println(asientos);
	
	//int: valor numerico de 32 bits
	int dulces = 3476;
	System.out.println(dulces);
	
	//long: valor numerico de 64 bits
		long clientes = 313600;
		System.out.println(clientes);
	//float: valor numerico de 32 bits
		float palomitas = 35.5f;
		System.out.println(palomitas);
	//double: sirve para valores numericos de 64 bits
		double ganancia = 23770880.7d;
		System.out.println(ganancia);
		
		
		//boolean sirve para representar booleanos, verdadero o falso
		//char sirve para mostrar un solo numero o caracter
		
		//casting sirve para realizar una conversion de tipos de datos a uno mas grande o pequeño
		
		double num = 59.7d;
		//casteo a entero
		int numInt = (int) num;
		System.out.println("double" + numInt);
		long numLong = (long) num;
		System.out.println("long" + numLong);
		
		String cantidad = "85";
		String precio = "59.7";
		int cantEntero = Integer.parseInt(cantidad);
		
		double precioDouble = Double.parseDouble(precio);
		System.out.println("El valor de la compra es:" + (cantEntero * precioDouble) );
		
		
		//operadores aritmeticos
		
		int dias = 28;
		dias = dias /2;
		System.out.println("dias: "+dias);
		
		//operadores de incremento y decremento
		
		int p = 0;
		p++;
	p++;
	p++;
	System.out.println(p);
	
	/*operarodes relacionales
	 *  == compara si un operando es igual a otro
	 * !0 diferente a 
	 * > mayor que
	 * < menor que
	 * >= mayor o igual
	 * <= menor o igual
	 * 
	 * */
	
	
	int a = 10;
	int b = 15;
	boolean resultado;
	resultado = a!=b;
	System.out.println("resultado de la operacion: "+ resultado);
	
	
	
		
		
	
	
	
	
	
	
	
	}

}
