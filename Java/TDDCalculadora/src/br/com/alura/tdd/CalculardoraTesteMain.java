package br.com.alura.tdd; 

public class CalculardoraTesteMain {

	public static void main(String[] args) {
		// A ideia por trás dos testes é ir pondo a prova o código que escrevemos.
		// nessa símples calculadora podemos pensar em diversos senários:

		// Uma Soma simples
		Calculadora calc = new Calculadora();
		int soma = calc.somar(1, 2);
		System.out.println(soma);

		// Uma soma com um número sendo ZERO
		soma = calc.somar(0, 2);
		System.out.println(soma);

		// Os dois números sendo ZERO
		soma = calc.somar(0, 0);
		System.out.println(soma);

		// A soma com um número negativo e etc...
		soma = calc.somar(1, -2);
		System.out.println(soma);

		// Mas se eu começo a realizar uma calculadora mais complexa, criar na mão todos
		// estes senários para as outras operações parece ser um gasto muito grande de
		// energia...
		// Estou indo no console para checar os resultados no olho para ver se eles
		// batem com a realidade, isso também está longe de ser ideal.

		//É aqui que entra o JUnit...
	}

}
