package BBHConta;


//The accounts that should actually work are the CC and CP, not CC by it self. 
public abstract class Conta {

	
	//A abstract class can have Attributes 
	
	//Attributes 
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 9;

    
  //A abstract class can have a Constructor  
    
  //Constructor 
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
    
    
    
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
                destino.deposita(valor);
                return true;
        } else {
                return false;
        }
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

}