package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;

//command + shift + o -> imports all needed classes for you... 
//it also something you can do to remove the .*; in order to just get the specific classes you need for the code. 

public class TesteSaca {
	
	
	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente (123,321);
		
		conta.deposita(2000.0);
		System.out.println("Valor antes de tentar sacar: " + conta.getSaldo());
		//conta.saca(0.0);
		System.out.println("Valor depois do primeiro saque: " + conta.getSaldo());
		//conta.saca(0.0);
		System.out.println("Valor depois do segundo saque... valor que ultrassa valor em conta:  " + conta.getSaldo()); // this won't print as a exception is thrown before  
	}

}
