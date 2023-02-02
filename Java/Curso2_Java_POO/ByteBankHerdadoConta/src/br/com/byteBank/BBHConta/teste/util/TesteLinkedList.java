package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.byteBank.BBHConta.modelo.Cliente;
import br.com.byteBank.BBHConta.modelo.Conta;
import br.com.byteBank.BBHConta.modelo.ContaCorrente;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		
		
		//ALL MY CODE IS STILL WORKING AFTER CHANGING FROM ARRAYLST TO LINKEDLIST ... THE METHODS ARE THE SAME
		//we have a interface that both implements that have the same methods... just different implementations,
		// I can use the interface to define the kind of reference. 
		
		
		
		LinkedList<Conta> lista = new LinkedList<Conta>(); // I can limit the kind of object a Array can manipulate, in this case I just want the array to store accounts, therefore I have put the class Conta under <>. 
		
		List<Conta> lista2 = new ArrayList<Conta>();
		
		List<Conta> lista3 = new Vector<Conta>(); // Works just like a array list, but is thread-safe, should be only used in multiple-thread applications, as due to its safety, is less memory efficient. 
		
		
		LinkedList<String> nomes = new LinkedList<String>();
		
		
		
		
		Cliente cliente = new Cliente();
		//lista.add(cliente); // I cannot to that, the code wont compile, as Cliente is another class, not Conta. 
		
		
		Conta cc1 = new ContaCorrente(22 ,11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente (22 ,22);
		lista.add(cc2);
		
		Object refCc1 = lista.get(0); // with Class Object, as the method requires 
		
		Conta refCc2 = /*(Conta)*/ lista.get(1); //Obs1: with the Cast, i'm forcing the class Conta instead of using Object  s above (both) works, but with the cast I have access to the methods from class Conta
		//obs2: I don't need to cast the class Conta anymore, as I have already restricted my ArrayList to only use the Class Conta at line 14, when I create it .  
		
		
		String banana = "Banana";
		nomes.add(banana);
		//nomes.add(cc1); //That wont work as cc1 it not a String. 
		
		
		
		
		 System.out.println("_________________________________________________________");
		System.out.println("Quantos elementos temos na lista: "+ lista.size());
		
		System.out.println(refCc1);
		System.out.println(refCc2);
		System.out.println(refCc2.getNumero()); // I can do this here do to the cast, forcing conta... but not at refCc1, that is using object, as getnumber is a method from class Conta, not present at class Object.     
	
		System.out.println(lista.get(0));
		lista.remove(0);   
		System.out.println("Quantos elementos temos agora na lista: "+ lista.size());
		
		System.out.println(lista.get(0));
		
		
		Conta cc3 = new ContaCorrente(22 ,33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente (22 ,44);
		lista.add(cc4);
		
		
		
		//Classic way to  over a list  
		
		for (int i = 0; i < lista.size(); i++) { // notice that is not length, but size, as we are working with ArrayList
		System.out.println("Passando agora pelo For: " + lista.get(i));
		}
		
		System.out.println("==============================================");
		
		
		//Modern way to  over a list 
		
		for (Object aRef : lista) { // Works the same way as the list above, it is just a more modern way to do it. 
			System.out.println(aRef);
			}
		
		// After adding the <Conta> at the ArratList, the iteration over the array becomes even clearer. 
		for (Conta conta : lista) { // Now that our list has only the class Conta. 
			System.out.println(conta);
			}
		
	}

}
