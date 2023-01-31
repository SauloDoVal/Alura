package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.ContaPoupanca;
import br.com.byteBank.BBHConta.modelo.GuardadorDeContas;
import br.com.byteBank.BBHConta.modelo.GuardadorDeRefs;

public class TesteGuardadorContasERefs {

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
	
	
	
	GuardadorDeRefs guardaRefs = new GuardadorDeRefs();
	
	Conta cc3 = new ContaCorrente (22,33);
	
	Conta cp1 = new ContaPoupanca (22,44);
	
	String banana = "Banana";
	
	int num = 123;
	
	guardaRefs.addRef(cc3);
	guardaRefs.addRef(cp1);
	guardaRefs.addRef(cc1);
	guardaRefs.addRef(banana);
	guardaRefs.addRef(num);
	System.out.println("------------------------------------------");

	
	int space = guardaRefs.getEspacoUtilizado();
	System.out.println("O espaço utiliado é de: " + space);
	
	
	Object objRef1 = guardaRefs.getRef(1);
	System.out.println(objRef1);
	
	Conta objRef2 = (Conta)guardaRefs.getRef(2); // I need to do a cast to get the Object as Conta
	System.out.println(objRef2);
	
	
	Object objRef3 = guardaRefs.getRef(3);
	System.out.println(objRef3);
	
	Object objRef4 = guardaRefs.getRef(4);
	System.out.println(objRef4);
	

	
	
}
}