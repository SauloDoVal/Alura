package br.com.byteBank.BBHConta.teste;

import br.com.byteBank.BBHConta.especial.ContaEspecial;
import java.lang.*; // I don't need to import Java Lang, it's the only class that is imported by default... it h

//the real name of this class is now  BBHConta.teste.TestaConta, and out of this package I will need to write this whole line access it. 
//BBHConta.teste.TestaConta -> This is the (FQN) Full Qualified Name

//I DIDN'T IMPORT THE PACKAGE MODELO SO THIS CAN BE A EXEMPLE...
public class TestaConta {

	public static void main(String[] args) throws br.com.byteBank.BBHConta.modelo.SaldoInsuficienteException {

		//This is a part of the exception course that I am training here
//		ContaCorrente outra = null; // I am initializing this reference, but I am not pointing at a object. 
//		outra.deposita(200.0); // I am depositing a value at a account that does not exist 
//		//The IDE is showing a error with a caution sining, but it is still compiling 
//		System.out.println(outra.getSaldo());//But if I try to print this, it will give me a null pointer... as there is no object at this pointer.
//		
//		int a = 3; 
//		int b = a / 0; // once again the syntax is ok, but there is a problem mathematical problem as we cannot divide a number by zero... therefore we have a AritimeticExeption 
//		
		ContaEspecial ce = new ContaEspecial(123 , 321);
		//ce.saldo// I cannot access as saldo is protected, avalible only for classes under the same package or linked through inheritance.  
		
		
		br.com.byteBank.BBHConta.modelo.ContaCorrente cc1 = new br.com.byteBank.BBHConta.modelo.ContaCorrente(111,111);
		cc1.deposita(100.0);
		
		br.com.byteBank.BBHConta.modelo.ContaPoupanca cp1 = new br.com.byteBank.BBHConta.modelo.ContaPoupanca(222, 222);
		cp1.deposita(200.0);
		
		cc1.transfere(10, cp1);
		
		System.out.println("CC:" + cc1.getSaldo());
		System.out.println("CP:" + cp1.getSaldo());
		
		
	}

}
