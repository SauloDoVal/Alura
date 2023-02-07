package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionaAulaAoCurso(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAulaAoCurso(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAulaAoCurso(new Aula("Modelando com coleções", 19));

		Aluno a1 = new Aluno("José das Couves", 123321);
		Aluno a2 = new Aluno("João do Mamão", 321123);
		Aluno a3 = new Aluno("Jiló dos Quiabos", 456654);
		Aluno a4 = new Aluno("Renata das Batatas", 654456);
		Aluno a5 = new Aluno("Mariana das Bananas", 789987);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);

		javaColecoes.estaMatriculado(a5); // Isso me retorina se o Aluno a5 está matriculado, mas vamos dizer que eu
											// quero saber quem é o aluno de determinada matrícola

		System.out.println("Quem é o aluno da matrícula 654456??");

		Aluno alunoBuscado = javaColecoes.buscaNomePorMatricula(000000);

		System.out.println("Aluno: " + alunoBuscado);

	}

}
