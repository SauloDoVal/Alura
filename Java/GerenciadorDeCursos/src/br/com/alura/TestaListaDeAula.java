package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {  
	
	public static void main(String[] args) {
		
		
		Aula a1 = new Aula("Revisitando as ArrayLists" , 21);
		Aula a2 = new Aula("Lista de objetos" , 19);
		Aula a3 = new Aula("Relacionamento de listas e objeto" , 15);
		
		
		
		ArrayList <Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		//aulas.add("Uma outra aula") // Isso não vai funcionar por conta da tipagem do Java... Nossa lista não pode receber Strings, só objetos da classe Aula.
		
		
		System.out.println(aulas); 
		//Inicialmente vai imprimir as referências do objeto [br.com.alura.Aula@5674cd4d, br.com.alura.Aula@63961c42, br.com.alura.Aula@65b54208], 
		//nome de pacote... @ e o hashcode, isso é herdado do object... mas vamos mudar isso, vamos meter um toString na classe Aula para definir. 
		
		Collections.sort(aulas); //Não vai funcionar nem organizar alfabeticamente como na classe String, que já tem um metodo sort pronto... aqui a gente vai ter que parametrizar ele...  
		System.out.println(aulas); 
		
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // Isso é muito doido... tenho que queimar mais cabeça com Comparators e afins. 
		System.out.println(aulas); 
		
		aulas.sort(Comparator.comparing(Aula::getTempo)); // Da no mesmo que o método acima... Também vou comparar as aulas de acordo com o tempo
		
		
	}

}
