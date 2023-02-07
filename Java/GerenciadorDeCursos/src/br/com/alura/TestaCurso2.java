package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionaAulaAoCurso(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAulaAoCurso(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAulaAoCurso(new Aula("Modelando com coleções", 19));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		System.out.println(aulasImutaveis);

		// Collections.sort(aulasImutaveis);  // Vai me lançar uma exception, mais especificamente
		// UnsupportedOperationException, isso aconteceu pq na classe Curso estamos retornando no getAulas return
		// System.out.println(aulasImutaveis); /Collections.unmodifiableList(aulas);
		

		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis); // Eu não voi poder mutar minhas aulas imutáves, mas eu
															// posso jogar elas em um novo ArrayList e assim trabalhar
															// com o negócio com calma

		Collections.sort(aulasMutaveis);
		
		
		System.out.println(aulasMutaveis); // agora sim, posso alterar/reorganizar 
		
		
		System.out.println("O tempo total do curso é de: "+ javaColecoes.getTempoTotal() + " Minutos." );
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println(javaColecoes);
		
		
		
	}
}
