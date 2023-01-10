package ByteBank;

public abstract class Funcionario {

	// vou tornar a classe Funcionário em Abstract, com isso, ela não pode ser mais inicializada na main, ela se torna uma classe que vai poder ser herdada, mas não vai funcionar por conta propria. 
	// This happens due to the fact that every employee has a function, a pre-define role, there are no such thing as a generic employee, we have managers, video editors, designers etc.
	
	private String nome;
	private String cpf;
	//protected double salario;
	public double salario;
		
	
	
	
	
	//as now we have different implementations of this particular method, we need to make it abstract and remove the logic inside of it. 
	//So now the classes that are sons of Funcionário will be able to implement their own logic. 
	//method with no body
	public abstract double getBonus();
	
	
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
