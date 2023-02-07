package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		
		
		
		Set <String> alunos = new HashSet<>();  // Pense no conjunto como um grande saco... eu não sei o que eu vou tirar deste saco, os elementos não ficam em ordem dentro dele 
		alunos.add("José das Couves");
		alunos.add("João do Mamão");
		alunos.add("Jiló dos Quiabos");
		alunos.add("Renata das Batatas");
		alunos.add("Mariana das Bananas");
		alunos.add("Pedroca da Mandioca");
		alunos.add("Pedroca da Mandioca");
		alunos.add("Pedroca da Mandioca");
		
		//O HashSet desconsidera elementos repetidos, só vai imprimir um "Pedroca da Mandioca". 
		System.out.println(alunos);
		
		System.out.println(alunos.size()); // Vai só imprimir 6, pq ele desconsidera os outros Pedrocas da Mandioca. 
		
		
	
		
		boolean jiloEstaMatriculado = alunos.contains("Jiló dos Quiabos"); // Todo metodo das collections tem o método contains... 
		System.out.println(jiloEstaMatriculado);//True
		
		boolean adicionouIgual = alunos.add("Pedroca da Mandioca"); // False, pq o Pedroca já tinha sido add
		System.out.println(adicionouIgual);
		boolean adicionouDiferente = alunos.add("Tião do feijão"); // True, pq o Tião do feijão é novo no SET e foi add. 
		System.out.println(adicionouDiferente);
		
		
		
			for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		
		
		
		
		List<String> alunosEmLista = new ArrayList <>(alunos);
		System.out.println("Pegando o primeiro da lista via ArrayList: " + alunosEmLista.get(0)); //  Vai funicionar
		
		
		
		
	}
	
	

}
