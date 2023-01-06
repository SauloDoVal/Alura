package sintaxesVariaveisEFluxos;

public class TestaEscopoVar {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		
		
		//Vamos pensar no escopo da variavel "acompanhado"
		
		if (quantidadePessoas >= 2) {
			
			//Por enquanto a Var acompanhado ainda não existe "Não foi declarada"
			boolean acompanhado = true;
			//Agora acompanhado passa a existir dentro do escopo do nosso if
		}else { 
			//A var aqui ainda não existe
			boolean acompanhado = true;
			//só existe no escopo do nosso else... quando a declaramos
		}
		//mas se eu pedir para imprimir essa variavel em um sout fora do escopo do if, não vai ser possivel. 
		
		//System.out.println(acompanhado); //vai dar erro
		
		
		// PARA RESOLVER, TEMOS QUE POR O ACOMPANHADO FORA DO ESCOPO DO IF/ELSE PRIMEIRO
		
		;
		int idade2 = 15;
		int quantidadePessoas2 = 1;
		boolean acompanhado2;
		
		
		
		if (quantidadePessoas >= 2) {
			
			 acompanhado2 = true;
		}else { 
			 acompanhado2 = false;
		}
		
		System.out.println(acompanhado2); 
		// eu tenho que fazer o FALSE, se não dá merda... tenho que ter o else se não o java quebra, ele não assume o false por si só. 
		
		
		
		
		
		
		
		
//		
//		
//		if (idade >= 18) {
//			System.out.println("Vc é maior de idade");
//			System.out.println("Wellcome to the jungle");
//		} else {
//			if (quantidadePessoas >= 2) {
//				System.out.println("vc é menor de idade mas está acomanhado... pode entrar");
//			} else {
//				System.out.println("Vc é muito novo para poder entrar");
//				System.out.println("e não está acompanhado ");
//			}
//
//		}
//
	}
}
