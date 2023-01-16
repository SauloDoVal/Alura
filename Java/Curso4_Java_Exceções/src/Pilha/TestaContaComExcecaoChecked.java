package Pilha;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("Tratamento da exceção...");
			
			
		}
		
	}

}


//We are going to use checked methods/classes when we fill that future devs must give a proper treatment to the method in question.
// Setup a try/catch due to the characteristics of the method in itself. 