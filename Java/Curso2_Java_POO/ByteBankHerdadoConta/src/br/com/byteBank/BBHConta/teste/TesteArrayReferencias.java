package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.Cliente;
import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		
		
		Object[] referencias = new Object[5];  //First I created a object that is nothing more then a array with 5 spaces, at first there is nothing inside it, as no ContaCorrete has been created. 
		
		ContaCorrente cc1 = new ContaCorrente(11,22);  //I create my first ContaCorrente, but the account is not yet stored at the array contas
		referencias[0] = cc1;  // Now I finally have stored cc1 at the array contas and it is currently occupying the position zero at the array. 
		
		ContaPoupanca cp1 = new ContaPoupanca(22,33);
		referencias[1] = cp1; 
		
		referencias[2] = "Caneta azul";
		
		Cliente cliente1 = new Cliente();
		referencias[3] = cliente1;
		
		
		System.out.println(cc1.getAgencia());
		//is the same as 
		//System.out.println(referencias[0].getAgencia());
		//as they are pointing to the same object in memory
		
		ContaCorrente ref = cc1; // ref is just another pointer to the object cc1, and will give me access just as cc1 and contas[0]
		//ContaCorrente ref2 = cp1; // This cannot happen as cp is a conta poupanca, not a conta corrente. 
		
		ContaPoupanca ref3 = (ContaPoupanca)referencias[1]; //T
		System.out.println(" Batata" + cp1.getNumero());
        System.out.println(" Banana" +ref3.getNumero());
        System.out.println(referencias[2]);
		//System.out.println(ref.getAgencia());  
		
		
		//System.out.println(referencias[2].getAgencia()); // there is nothing stored in the index 2 of my array, this will show me a NullPointException 
		
		
		
		System.out.println(cc1.getNumero());
		
//		Object[] tudo = new Object[5];
		
		
		
	}

}
 