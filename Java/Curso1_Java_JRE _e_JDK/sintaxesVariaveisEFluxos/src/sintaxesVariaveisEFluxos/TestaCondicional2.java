package sintaxesVariaveisEFluxos;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		System.out.println("======= Bem-vindo ao PARQUE DE CINEMA ======");
		int idade = 17;
		int acompanhantes = 0;

		if (idade >= 18) {
			System.out.println("Vc é um maior e pode entrar");
		} else {
			if (acompanhantes >= 1) {
				System.out.println("Vc é menor de idade mas pode entrar por estar acompanhado por " + acompanhantes
						+ " acompanhante(s)");
			} else {
				System.out.println("Vc é menor de idade e não está acompanhado, infelizmentenão pode entrar!");
			}
		}

// refatorando esse código afim de evitar os muitos "Ifs"

		System.out.println("======= Bem-vindo ao PARQUE DE DIVERÕES ======");
		int idadeRef = 18;
		int acompanhantesRef = 0;

		if (idadeRef >= 18 || acompanhantesRef >= 1) {
			System.out.println("Bem vindo, vc tem "+idadeRef+"  vc pode entrar e está acompanhado por "+ acompanhantesRef);
		} else {
			System.out.println("Vc é menor de idade e não está acompanhado, infelizmentenão pode entrar!");
		}


// Agora usando boolean

		
		System.out.println("XXXXXXXX Bem-vindo ao Clube de Swing XXXXXXXX");	
		
int idadeRef2 = 34;
int quantidadePessoasExtras = 2;
boolean acompanhado = quantidadePessoasExtras >=1; 

if (idadeRef >= 18 && acompanhado)  {  //não preciso botar acompanhantesRef2==true... já fica implicito que estou falando de true só botando acompanhantesRef2
	System.out.println("Bem vindo, vc pode entrar é maior de idade (" + idadeRef2+" anos) e está acompanhado");
} else {
	System.out.println("Vc é menor de idade ou não está acompanhado, infelizmentenão pode entrar!");
}
}
}


