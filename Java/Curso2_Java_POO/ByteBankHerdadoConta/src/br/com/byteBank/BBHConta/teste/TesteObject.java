 package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.modelo.ContaCorrente;
import br.com.byteBank.BBHConta.modelo.ContaPoupanca;

public class TesteObject extends Object{

	public static void main(String[] args) {

		System.out.println();  // I can leave it empty. 
		System.out.println("x"); //I can put a String
		System.out.println(1);  // I can put a Number
		System.out.println(false); //or a Boolean
		
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca (33 ,22);
		
		System.out.println(cc); // It will show me a strange number, but the point is... it can be done, and I can override the method toString() to make it show me what I want. 
		
		System.out.println(cp);
		
		
		println(1);
		println(cc);// this is possible due to the fact that I have created a method for it below, showing how can I Overload a method. 
		println(cp);// this can't be done, unless I create a method for it below OR... if I set the class Object and a reference in it
		//This changes everything, as the class Object allows me to create a reference with all sort of references... 
		
		
		
		
		
		
		
		
	}
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	static void println(boolean bool) {
	
}
	static void println(ContaCorrente conta) {
		
	}

	static void println(Object reference) {
		
	}
	
	
	
	
}
