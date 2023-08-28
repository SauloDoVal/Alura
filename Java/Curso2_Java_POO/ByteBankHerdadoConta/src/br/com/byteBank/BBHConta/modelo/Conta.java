package br.com.byteBank.BBHConta.modelo;

import java.io.Serializable;

//The accounts that should actually work are the CC and CP, not CC by it self. 
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	//I can Implement Comparable  I want to set how an Account will be compared with the other,to see this implementation, go to TesteComComparable 
	

	/**
	 * Class that represents the frame of a account.
	 * @author: saulosrdoval
	 * @version: 0.1 
	 */
	
	//A abstract class can have Attributes 
	
	//Attributes 
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    
  //A abstract class can have a Constructor  
    
  /**
   * Constructor to initialize the object according to the agency and number. 
   * 
   * @param agencia //The parameters that are part of the constructor can be highlighted at the commentary 
   * @param numero  // 
   */
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    
    
  //A abstract class can have methods 
  // & we can also create abstract methods ourselves, remember... those methods should not have logic in them, just the signature.
  //As we set the method as abstract, we will need to create those methods in the class sons...  
    
    //Methods 
    public abstract void deposita(double valor);
    
    
    // I am now changing this code, instead of boolean, I will make this return me a void... and I will add a try/catch in case or errors.
    // In general, the exceptions go above the logic... 
    /**
     * At this method, the saldo must be larger than the value being draft
     * 
     * 
     * @param valor // Shows the Parameter 
     * @throws SaldoInsuficienteException // Shows the exception that is being thrown.
     */
    public void saca(double valor) throws SaldoInsuficienteException{ //With a checked method, I need to put this throw in the signature of the method.
        if(this.saldo < valor) {
        	// The saldo should not be smaller than the amount I want to withdraw... I am trying to point this as a issue and throwing my error to deal with it 
        	throw new SaldoInsuficienteException ("Saldo em conta: " + this.saldo + ", Valor do saque:  " + valor);
        	}
            this.saldo -= valor;
        
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor); // Now, if saca does not work the exception will be thrown and leave the method. 
        destino.deposita(valor);
        
        
    }
    
    
    //Getters and Setters  

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    
    
    
    @Override
    public int compareTo(Conta outra) {
    	return Double.compare(this.saldo, outra.saldo);
    }
    
    
    
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número: " +  this.getNumero() + " Agência: " + this.getAgencia() + " Saldo: " + this.saldo
				;


}


	public boolean ehIgual(Conta outra) {
		if(this.agencia != outra.agencia) {
			return false; 
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
    
//------------- Instead of this homemade method, lets use the method .equals, overriding it with our implementation  
    
	
	@Override
	public boolean equals(Object ref) {
    	
    	Conta outra = (Conta) ref;
    	
		if(this.agencia != outra.agencia) {
			return false; 
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
    
  
	
	
    
    
    
}