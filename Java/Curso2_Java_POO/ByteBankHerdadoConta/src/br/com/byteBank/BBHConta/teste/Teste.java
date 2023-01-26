package br.com.byteBank.BBHConta.teste;

public class Teste {

	
	public static void main(String[] args) {
		
		//when we hava a series of data we can create multiple variables to store them, but this is not very effective, as we can see below
		
		int idade1 = 29;
		int idade2 = 39;
		int idade3 = 19;
		int idade4 = 69;
		int idade5 = 59;
		
		// Therefore, in java we have our data structure, being the Array the first we are going to talk about. 
		
		int [] idades; //This is the same as int idades []; the order does not make a difference. 
		
		int [] ages = new int[5]; //As all objects (with the exception of Strings) I am required to use the word 'new'. 
		//with Arrays I need to establish the number of spots the array will have... in our case, 5. 
		
		
		
		
		ages[0] = 29;
		ages[1] = 39;
		ages[2] = 19;
		ages[3] = 69;
		ages[4] = 59;
		
		int age1 = ages[0];
		
		System.out.println(ages[0]);
		
		System.out.println(ages.length );
		
		System.out.println(age1);
		
		
		
		int [] testArray = new int [10];
		
		
		for(int i = 0; i < testArray.length ; i++) {
			testArray[i] = i * i ; 
		}
		
		for(int i = 0; i < testArray.length ; i++) {
			System.out.println(testArray[i]);
		}
		
		
		
		
	}
	
	
	
	
	
}
