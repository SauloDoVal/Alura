package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Aula1TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1); // Adicionando Aula 1
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas); // Por padrão, o toString de uma ArrayList retorna os elementos da lista
									// separados por vírgulas, respeitando a ordem de index.

		aulas.remove(0);// removendo pelo index... o primeiro elemento no caso é o index ZERO

		System.out.println(aulas);// A string aula1 já não é mais impressa.

		for (String aula : aulas) { // Foreach do java não tem nome de foreach, veio com o java 8 e é uma forma mais
									// fácil de iterrar, comparado com o método antigo.
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0); // através do método GET eu posso acessar as aulas no índice do meu Array
		System.out.println("A primeira aula é: " + primeiraAula);

		System.out.println(aulas.size()); // método para se obter o número de elementos do ArrayList... Não conta o zero

		// Usando o SIZE e o GET para fazer um for tradicional

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aulas no Tradicional for :" + aulas.get(i)); // se botamos um (<=) no lugar do (<) vamos
																				// ter uma clássica exception no caso de
																				// ArrayLists, a
																				// IndexOutOfBoundsException, pq o loop
																				// tenta percorrer para alem do tamanho
																				// da Array
		}

		// Outro método de incrementar a ArrayList é usar o forEach que foi add a classe
		// collections a partir do Java 8, fazendo o uso de lambdas

		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
			System.out.println();

		});
		
		
		aulas.add("Aumentando nosso conhecimento sobre Arrays");
		System.out.println(aulas);
		Collections.sort(aulas);  // O método Sort é um método que utilizamos para organizar a ArrayList, no caso de uma array de Strings, por default vai ser por ordem alfabética 
		System.out.println(aulas);
	}

}
