package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionaAulaAoCurso(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAulaAoCurso(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAulaAoCurso(new Aula("Modelando com coleções", 19));

		
		Aluno a1 = new Aluno ("José das Couves", 123321);
		Aluno a2 = new Aluno("João do Mamão",321123);
		Aluno a3 = new Aluno("Jiló dos Quiabos",456654);
		Aluno a4 = new Aluno("Renata das Batatas",654456);
		Aluno a5 = new Aluno("Mariana das Bananas",789987);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		javaColecoes.matricula(a5);
		
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {System.out.println(a);});  // EU TENHO QUE APRENDER LAMBDA MELHOR 
		for (Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a + "Banana, banana, banana");
		}
		
		
		
		
		System.out.print("O Aluno " + a1.getNome() + " está Matriculado ? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		String nome = "José das Couves";
		Aluno procurado = new Aluno("José das Couves", 123321);
		System.out.println(javaColecoes.estaMatriculado(procurado)); // Para ter sucesso aqui, não basta reescrever o equals... preciso reescrever o tal do HashCode, que é o endereço identificador do objeto 
		//Ainda não entendi de qual é essa de HASHCODE.
		System.out.print("O a1 é igual ao procurado ? " );
		System.out.println(a1 == procurado); // Dois irmãos gêmios são muito parecidos, mas eles são pessoas diferentes... o mesmo aqui... são objetos diferentes
		System.out.print("O a1 é igual ao procurado ? " );
		System.out.println(a1.equals(procurado));
		//Para ter acesso a um método que procura, dada um string ou objeto, se um aluno faz parte do meu curso, vou reescrever o método equals. 
		//Com o .equals vai dar certo, com o == não. 
		
		// Se eu tenho dois objetos que são considerados idênticos, eles precisam ter o mesmo código de espalhamento, o mesmo "número mágico". 
		
		System.out.println(a1.hashCode() == procurado.hashCode());
		
	}
	


}
