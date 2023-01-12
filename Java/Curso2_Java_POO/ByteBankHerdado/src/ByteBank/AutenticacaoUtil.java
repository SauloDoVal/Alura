package ByteBank;

public class AutenticacaoUtil {
	
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;

	}

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("O Cliente digitou a senha Correta");
			return true;
		} else {
			System.out.println("O Cliente digitou a senha Errada");
			return false;
		}
	}
	
	
	
	
	

}
