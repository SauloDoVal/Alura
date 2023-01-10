package ByteBank;

public class GerenteCerto extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public double getBonus() { // para o gerente ter acesso a mudar o salário, vamos ter que tirar esta classe
								// de private para public(aberta para geral) ou protected ( aberta para a galera
								// que herda Funcionário, como no caso do nosso gerente)
	//return super.getBonus() + super.getSalario();	// para deixar explicito que o salário vem da super classe (classe mãe) no lugar do this, podemos usar o super... mas não me quebra o código usar o this. 
		//posso aproveitar o método da classe super... mas aqui, nesse aproveitamento de método eu não posso usar o 'this'
	
		//return super.getBonus() + super.salario;// eu posso, no lugar de usar super.salário, manter a classe salario como privada (no lugar de protected) e pegar esse saláriu usando o método super.getSalario 
		//Inclusive, este é o método indicado. 
		System.out.println("Chamando o método do Gerente");
		return super.getBonus() + super.getSalario();
	
	
	}

}
