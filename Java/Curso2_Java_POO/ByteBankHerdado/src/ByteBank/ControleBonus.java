package ByteBank;

public class ControleBonus {

	private double soma;

//	public void registra(GerenteCerto g) {
//		double bonus = g.getBonus();
//		this.soma = this.soma + bonus;
//	}
//	
//	
//	public void registra(Funcionario f) {
//		double bonus = f.getBonus();
//		this.soma = this.soma + bonus;
//	}
//	
//	
//	public void registra(EditorVideo e) {
//		double bonus = e.getBonus();
//		this.soma = this.soma + bonus;
//	}

	// I am repeating the same code over and over again, I can have only one method
	// for every employee by applying this method to the SuperClass Funcionario, the most general reference

	public void registra(Funcionario f) {
		double bonus = f.getBonus();
		this.soma = this.soma + bonus;
	}
	
	// Due to Polymorphism, whenever a Gerente or a EditorVideo calls for the funtion, their on bonus will be called, we can check that due to a 
	// sout we have added to their particular methods 
	
	
	public double getSoma() {
		return soma;
	}

}
