package br.com.byteBank.BBHConta.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {
		
		int [] idades = new int [5]; 
		String [] nomes = new String[5];
	
		//There are arrays of lists and array of references... but in the world of lists, there are only lists of references. 
		// knowing this, I should not be able to store a int variable in a ArrayList. 
		int idade = 29;
		List numeros = new ArrayList();
		numeros.add(idade); 
		System.out.println(numeros.get(0));
		
		//But apparently we can... as JAVA has a workaround to avoid this issue. 
		//for every primitive type, we have a class... in the case of int, we have Integer. 
		// under the hood, JAVA is doing the following in line 15... 
		Integer idadeRef = new Integer(29);// This was depricated... now it should be
		Integer idadeRef2 = Integer.valueOf(32); // this is how this object should be now created 
		//A list of <int> wont work, as int is a primitive, not a reference. 
		//List<int> numeros2 = new ArrayList<int>();
		//But I can create a list of Integers 
		List<Integer> numeros2 = new ArrayList<Integer>();
		
		
		int valor = idadeRef2.intValue();
		
		System.out.println(valor);
		
		
		int x = Integer.parseInt("9");
		System.out.println(x);
		
		System.out.println(Integer.MIN_VALUE
				);
		
		
	}
	
	
	
}
