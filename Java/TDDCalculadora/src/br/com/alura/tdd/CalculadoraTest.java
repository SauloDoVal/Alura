package br.com.alura.tdd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	// No JUnit temos a convenção que a classe teste recebe o nome da classe sendo
	// testada + Test no final da palavra.

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		assertEquals(10, soma);

	}

}
