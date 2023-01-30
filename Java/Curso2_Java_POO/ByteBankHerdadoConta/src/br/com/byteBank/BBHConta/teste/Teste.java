package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
	
	 
	GuardadorDeContas guardador = new GuardadorDeContas(); // I have created this class so I can store things in it instead of storying directly at the array. 
	
	Conta cc1 = new ContaCorrente (22, 11);
	
	guardador.adiciona(cc1); // This is now going to work, having into consideration that the method adciona has now this piece of code in it "this.referencias[0] = ref;"
	//but if I try to add another account into it, it will be over writing, deleting the previous one 
	
	Conta cc2 = new ContaCorrente (22, 22);
	guardador.adiciona(cc2);
	
	
	
	int espaçoUsado = guardador.getQuantidadeDeElementos(); // This method is used so we can identify the number of elements already being used in our array. 
	System.out.println(espaçoUsado);
	
	
	Conta ref = guardador.getReferencia(1); 
	System.out.println(ref);
	
	
	
	
}
}