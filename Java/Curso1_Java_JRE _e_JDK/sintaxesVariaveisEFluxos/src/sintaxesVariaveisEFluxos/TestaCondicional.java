package sintaxesVariaveisEFluxos;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Vc é maior de idade");
			System.out.println("Wellcome to the jungle");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("vc é menor de idade mas está acomanhado... pode entrar");
			} else {
				System.out.println("Vc é muito novo para poder entrar");
				System.out.println("e não está acompanhado ");
			}

		}

	}
}
