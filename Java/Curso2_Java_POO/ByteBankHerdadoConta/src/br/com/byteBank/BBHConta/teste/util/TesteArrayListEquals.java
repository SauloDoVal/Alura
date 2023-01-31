package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;

import br.com.byteBank.BBHConta.modelo.Cliente;
import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		
		ArrayList<Conta> lista = new ArrayList<Conta>(); // I can limit the kind of object a Array can manipulate, in this case I just want the array to store accounts, therefore I have put the class Conta under <>. 
		
		
		
		
		
		
		
		
		Conta cc1 = new ContaCorrente(22 ,11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente (22 ,22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente (22 ,22);
		
		System.out.println("--------------------------------------------------------------");
		for (Conta conta : lista) { // Now that our list has only the class Conta. 
			System.out.println(conta);
			}
		
		boolean elementoExiste = lista.contains(cc2);
		
		
		System.out.println("O elemento cc2 faz parte da lista ? " + elementoExiste);
		
		
		
	}

}
