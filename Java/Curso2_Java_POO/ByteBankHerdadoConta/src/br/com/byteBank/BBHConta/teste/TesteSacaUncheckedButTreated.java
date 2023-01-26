package br.com.byteBank.BBHConta.teste;
import br.com.byteBank.BBHConta.modelo.*;
//br.com.byteBank.BBHConta.teste.TesteSacaUncheckedButTreated -> FQN
public class TesteSacaUncheckedButTreated {
	
	
	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente (123,321);
		
		conta.deposita(2000.0);
		System.out.println("Valor antes de tentar sacar: " + conta.getSaldo());
		//conta.saca(1500.0);
		System.out.println("Valor depois do primeiro saque: " + conta.getSaldo());
		
		try {
		conta.saca(500.0);
		} catch (SaldoInsuficienteException ex){
			System.out.println("me dá a sua msg: " + ex.getMessage() + " Não rolou de sacar");
		}
		System.out.println("Valor depois da tentativa do segundo saque... valor que ultrassa valor em conta:  " + conta.getSaldo()); // this won't print as a exception is thrown before  
	}	// With the proper treatment Try/Catch, the lest line is printed 

}
