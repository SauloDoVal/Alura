package sintaxesVariaveisEFluxos;

public class TestaPontoFlutuante {
	
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.79;
		
		System.out.println("Meu salário é " + salario);
		
		
		double divisao = 3.14/2;
		System.out.println("O valor de PI é " + divisao);
		
		
		int outraDivisao = 5/2; 
		
		System.out.println("O valor de 5 / 2 é quebrado, mas se eu ponho como um int o resutlado é " + outraDivisao + " deixando o 0.5 de lado");
		
		double divisaocomdouble = 5/2; 
		
		System.out.println(" com double vai dar " + divisaocomdouble + " isso pq ele fez a conta primeiro, depois viu que era double... dai fica 2.0"); 
		
		double divisaocomdouble2 = 5.0/2; 
		
		System.out.println("Agora vai: " + divisaocomdouble2 + "só pq eu botei o 5.0... mostrando q era double de cara");
		
	} 

}
  