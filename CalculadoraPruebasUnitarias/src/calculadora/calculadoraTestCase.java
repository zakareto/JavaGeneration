package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class calculadoraTestCase {

	@Test
	void testSumar() {
		
		
		int resultado = calculadora.sumar(2, 3);
		Assert.assertEquals(5, resultado);
	}
	
	
	@Test
	void testmultiplicar() {
		
		
		int resultado = calculadora.multiplicar(2, 3);
		Assert.assertEquals(6, resultado);
	}

	
	@Test
	void testdividir() {
		
		
		float resultado = calculadora.dividir(6.0f, 2.0f);
		Assert.assertEquals(3, resultado);
	}

}
