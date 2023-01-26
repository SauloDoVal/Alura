package br.com.byteBank.BBHConta.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "TESTE"; //As we can see, String is a class, therefore the capital S at the beginning, 
		//nonetheless, as we create a object with it, we do not need to use "new" to create it. 
		String outroNome = new String ("teste2"); // this is possible, but not used as the virtual machine accepts the above.
		
		
		nome.replace("T", "B");
		nome.toLowerCase();
		
		String nomeTrocado = nome.replace("T", "B");
		
		
		char ex = nome.charAt(2);
		System.out.println(ex);  // It will print 'S' as it is the character at position 2, in Java we start counting from the position ZERO
		//Therefore T=0, E=1, S=2, T=3, E=4. 
		int pos = nome.indexOf("ST");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub );
		
		int len = nome.length();
		System.out.println(len);
		
		System.out.println(nome.isEmpty()); // isEmpty returns me a boolean, so as we have TESTE in this particular string, it will return me false. 
		
		String blank = (" ");
		
		System.out.println(blank.isEmpty()); 
		
		String blankWithNoSpace = blank.trim();
		
		System.out.println(blankWithNoSpace.isEmpty());
		
		
		
		
		 
		System.out.println(nome);
		System.out.println(nomeTrocado);


		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto2 = builder.toString();
		System.out.println(texto);
		
		
		
		
	}

}
 