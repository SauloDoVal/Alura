package br.com.alura;

import java.util.List;

public class TestaCurso {
public static void main(String[] args) {
	
	Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira"); 
	
	
//	List<Aula> aulas = javaColecoes.getAulas();
//	System.out.println(aulas); // me devoulveu um array vazio [], já que não tem nada la dentro mesmo
//	
//	System.out.println(javaColecoes.getAulas()); // Tb vai voltar vazia 
//	
//	aulas.add(new Aula("Trabalhando com ArrayList", 21));
	
	
//	javaColecoes.getAulas().add(new Aula("Trabalhando com Array", 21)); //condeçando tudo ai de cima em uma única lista. // MESMO ASSIM TEM COMO MELHORAR
	javaColecoes.adicionaAulaAoCurso(new Aula("Trabalhando com ArrayList", 21)); // Se quiser adicionar, vai ter que ser desta forma. 
	javaColecoes.adicionaAulaAoCurso(new Aula("Criando uma Aula", 20));
	javaColecoes.adicionaAulaAoCurso(new Aula("Modelando com coleções", 19));
	
	
//	System.out.println(aulas); // agora temos 1 aula aqui
	System.out.println(javaColecoes.getAulas()); // e tb aqui. 
//	System.out.println(aulas == javaColecoes.getAulas()); // Vai me voltar true esta comparação... os dois são a mesma coisa. 
	
	//PERCEBA: Só a Classe cursos sabe que a List é uma LinkedList. não da para perceber aqui da nossa main, isso deixa o nosso código mais protegido. 
	
}
}
