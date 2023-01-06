package sintaxesVariaveisEFluxos;

public class TesteSomatoria {

	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) {
			// preiciso inicializar a variavel total para as coisas irem pra frente... mas
			// ela não pode estar dentro do escopo... caso contrario eu estarei sempre
			// pegando ela do zero (inicializando)
			//total = total + contador;
			total += contador; // mesma coisa que o códgigo comentado 
			// para pegar só a soma dos números... e não a soma acontecendo é só por o
			// System.out.println(total); fora do escopo do while
			contador++;
		}
		System.out.println(total);
	}

}
