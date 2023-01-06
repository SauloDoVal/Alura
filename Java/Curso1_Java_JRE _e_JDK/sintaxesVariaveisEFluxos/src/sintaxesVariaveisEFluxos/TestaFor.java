package sintaxesVariaveisEFluxos;

public class TestaFor {

	public static void main(String[] args) {

		// Aqui temos um for... a primeira parte de um for (antes do ;) determina o
		// início da nossa contagem, a segunda parte (entre os ;) determina a condição
		// da nossa contagem... quando vamos parar de contar e a última parte (a direita
		// do ;) determina como ele será incrementado a cada volta

		// Vale notar que diferente do While... eu não preciso declarar a variavel fora
		// do escopo... só dentro do parentes já está de boa... mas por outro lado, não
		// consigo imprimir "contador" fora do escopo do for... como conseguia no while.

		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}

	}

}
