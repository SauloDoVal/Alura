package br.com.byteBank.BBHConta.modelo;

public class GuardadorDeContas {
	
	
	private Conta[] referencias; 
	private int posicaoOcupadas;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10]; //We are using the constructor to initialize our attributes (good practices)  
		this.posicaoOcupadas = 0;
	}
	
	
	
	public void adiciona (Conta ref) { // This method will store the "Conta" at the first free position of my Array.
		this.referencias[this.posicaoOcupadas] = ref;		
		this.posicaoOcupadas++; // Now, whenever I use this method, it will increment... so I won't have problems with the number zero no more. 
	}



	public int getQuantidadeDeElementos() { // To have access to the total quantity of elements being uses in our array
		return this.posicaoOcupadas;
	}



	public Conta getReferencia(int pos) {   // To verify the element that is being used, I provide the number of the element in the array and the method returns what element it is. 
		return this.referencias[pos];
	}
	

}
