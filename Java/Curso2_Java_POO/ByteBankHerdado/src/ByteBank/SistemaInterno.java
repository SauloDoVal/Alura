package ByteBank;

public class SistemaInterno {

	private int senha = 3333;

	public void autentica(Autenticavel fa) {
		boolean autenticado = fa.autentica(this.senha);
		if (autenticado) {
			System.out.println("Chega ai, pode entrar, ta em casa");
		} else { 
			System.out.println("Vaza daqui malandro");
		}

	}

}
