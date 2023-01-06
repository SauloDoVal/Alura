package sintaxesVariaveisEFluxos;

public class ExercicioWhileToFor {

	public static void main(String[] args) {
		int contador = 0;
		

		while (contador <= 10) {
			System.out.println("While:" + contador);
			contador++;
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println("for:" + i);
		}

	}

}
