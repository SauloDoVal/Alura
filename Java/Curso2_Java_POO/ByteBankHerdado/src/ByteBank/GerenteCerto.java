package ByteBank;

//The GerenteCerto will inherit from Funcionario (mother of all and grandma of GerenteCerto) and FuncionarioAutenticavel (its mother)  
public class GerenteCerto extends Funcionario implements Autenticavel { 

	// GerenteCerto will extends Funcionario and Implements Autenticavel... you cannot extend 2 classes (inherited from 2, but you can implement a interface and extend a class at the same time.

	//This is a has a relationship, the GerenteCerto HAS An AutenticacaoUtil. ==> This is a composition. 
	//The same relationship that happens at the Administrador and Client
	private AutenticacaoUtil autenticador;

	public GerenteCerto() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	
	public double getBonus() { // para o gerente ter acesso a mudar o salário, vamos ter que tirar esta classe
								// de private para public(aberta para geral) ou protected ( aberta para a galera
								// que herda Funcionário, como no caso do nosso gerente)
		// return super.getBonus() + super.getSalario(); // para deixar explicito que o
		// salário vem da super classe (classe mãe) no lugar do this, podemos usar o
		// super... mas não me quebra o código usar o this.
		// posso aproveitar o método da classe super... mas aqui, nesse aproveitamento
		// de método eu não posso usar o 'this'

		// return super.getBonus() + super.salario;// eu posso, no lugar de usar
		// super.salário, manter a classe salario como privada (no lugar de protected) e
		// pegar esse saláriu usando o método super.getSalario
		// Inclusive, este é o método indicado.
		System.out.println("Chamando o método do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

}
