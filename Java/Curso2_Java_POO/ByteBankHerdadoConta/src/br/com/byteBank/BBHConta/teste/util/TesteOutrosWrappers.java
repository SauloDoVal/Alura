package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //Autoboxing 
		System.out.println(idadeRef.intValue()); //Unboxing
		
		
		Double dRef = Double.valueOf(3.2); //Autoboxing 
		System.out.println(dRef.doubleValue()); //Unboxing
		 
		
		Boolean bRef = Boolean.TRUE; // Obs: Constants are all in captal letters in JAVA.  
		System.out.println(bRef.booleanValue());
		
		Number numero = Integer.valueOf(32); // I can do that as Integer extends the class number, as other wrappers like: Double, Float, Long, Integer, Short and Byte
		
		
		List<Number> lista = new ArrayList<Number>(); // That way I can create a ArrayList that can receive All kind of numbers...  		
	
		lista.add(10); //int
		lista.add(32.6); //double
		lista.add(24.5f); // float... I can store them all at my list
	
	}

}
