package colecciones;

public class Cliente {

	
	//atributos
	
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	// constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		this.nombre = nombre;
		this.setCuentaBancaria(cuentaBancaria);
		this.setSaldo(saldo);
		this.nip = nip;
	}
	
	//metodos
	
	public void mostrarInfoCliente() {
		System.out.println("el nombre es:" + nombre);
		System.out.println("la cuenta bancaria es:" + getCuentaBancaria());
		System.out.println("el saldo es:" + getSaldo());
		System.out.println("el nip es:" + nip);
		
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
}
