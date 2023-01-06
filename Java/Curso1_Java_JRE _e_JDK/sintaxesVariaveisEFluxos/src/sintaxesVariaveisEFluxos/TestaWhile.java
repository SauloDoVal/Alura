package sintaxesVariaveisEFluxos;

public class TestaWhile {
	
	 public static void main(String[] args) {
		
		 
		//O While Recebe sempre uma expressão booleana e vai correr até que a premissa seja atendida
		
		 int contador = 0; // o int não tem valor default, tenho que por o ZERO
		 
		 while (contador <= 10) {
			 
			 System.out.println(contador); // para isso correr, eu preciso incrementar o contador. 
			 //agora eu estou incrementando o nosso while... 
			 //contador = contador + 1 // Mesma coisa que o de baixo... muda a sintaxe, mas a ideia é a mesma
			 // contador +=  1; // Mesma coisa que o de baixo... muda a sintaxe, mas a ideia é a mesma
			 contador++;
			 
		 } 
		 System.out.println(contador + " Fora do escopo"); // vai imprimir 11... que é onde o contador parou. 
	}
	 

}
