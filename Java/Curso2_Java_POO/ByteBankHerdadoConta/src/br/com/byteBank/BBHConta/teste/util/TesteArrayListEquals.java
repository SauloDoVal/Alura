package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;

import br.com.byteBank.BBHConta.modelo.Cliente;
import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>(); // I can limit the kind of object a Array can manipulate, in
															// this case I just want the array to store accounts,
															// therefore I have put the class Conta under <>.

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22); // cc3 and cc2 represents the same account, but if I check if
		// list.contains(cc3), it will return me false, as it analyzes the
												// reference(cc3) not the account in it self.

		System.out.println("--------------------------------------------------------------");

		System.out.println(lista.contains(cc2));
		System.out.println(lista.contains(cc3));
		
		boolean elementoExiste = lista.contains(cc2);

		System.out.println("O elemento cc2 faz parte da lista ? " + elementoExiste);
		
		
		for (Conta conta : lista) { // under the hood, this is what is happening with the method contains
			if (conta == cc3) {
				System.out.println("Já tenho esta referência/conta");
			} else {
				System.out.println("Não tenho esta referência/conta");
			}
		}
		
	
		// But lets say that I want to check if one reference has the same content as the other... 
		// if different references are pointing to the same account and agency, how can I do that... 
		// I will need to implement a method that... and I have implemented at the class conta with the name eh ígual
		
		

		boolean igualcc1Ecc2 = cc1.ehIgual(cc2);
		boolean igualcc2Ecc3 = cc2.ehIgual(cc3);
		boolean equalscc1Ecc2 = cc1.equals(cc2);
		boolean equalscc2Ecc3 = cc2.equals(cc3);
		
		System.out.println("A conta cc1 é igual a conta cc2 ? " + igualcc1Ecc2);
		System.out.println("A conta cc2 é igual a conta cc3 ? " + igualcc2Ecc3);
		System.out.println("A conta cc1 é igual a conta cc2 ? " + equalscc1Ecc2);
		System.out.println("A conta cc2 é igual a conta cc3 ? " + equalscc2Ecc3);
		
		
		boolean elementoExistecc3 = lista.contains(cc3);

		System.out.println("O elemento cc3 faz parte da lista ? " + elementoExistecc3);
		

	}

}
