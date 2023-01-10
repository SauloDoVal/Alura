package ByteBank;

public class GerenteSemHeranca {
	
	//Essa classe gerente até que está ok, mas estou repetindo tudo mais uma vez... o que não é lá muito legal. 
	//O melhor seria poder aproveitar o código já existente, fazendo ele herdar caracteristiscas já estabelecidadas na classe funcionário  

	
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	
		
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;  
		}else {
			return false;  
		}
	}
	
	
	
	
	public double getBonus() {
		return this.salario ;
	}
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
