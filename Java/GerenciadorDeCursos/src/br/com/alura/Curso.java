package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // No lugar de declarar o primeiro ArrayList é uma boa prática
														// criar uma
														// list, tida como uma forma extra de encapsulamento, de
														// esconder quem está dentro... Posso não me comprometer com o
														// array list e passar a usar um linked list no futuro
	
	public Set<Aluno> alunos = new HashSet<>();
	
	
	
	public Curso(String nome, String intrutor) {

		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() { // Quero que só o método adiciona seja possível... por isso vamos tornar este
									// método "imexivel"
		return Collections.unmodifiableList(aulas);
	}

	public void adicionaAulaAoCurso(Aula aula) {
		// getAulas().add(aula); ao tornar o getAulas imutave, eu não posso fazer a
		// adição por ele... mas a gente da um jeito.
		this.aulas.add(aula);
	}

	// REESCREVENDO ESTE MËTODO EM JAVA 8.
//	public int getTempoTotal() {
//		int tempoTotal = 0; 
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
//		
//	}

	// VERSÃO JAVA 8

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // Deus... tenho que ver isso... ainda não to 100%
																	// nesse rolê
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + "Tempo de duração: " + this.getTempoTotal() + " Minutos ]" + "aulas; " + this.aulas;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);  //Criei um método get para os alunos, mas proibi qualquer alteração direta a lista com o método unmodifiableSet
	}

	public  boolean estaMatriculado(Aluno aluno) { //Método para checar se o aluno está matriculado, se ele consta no curso
		return alunos.contains(aluno);
	}
	
	
	
	
	
	
	
	
	
}
