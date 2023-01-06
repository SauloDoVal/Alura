package ByteBank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();

		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(123); // em um primeiro momento não vai somar nada pq o método está sem lógica dentro
		System.out.println(contaDoPaulo.saldo);

		contaDoPaulo.saca(10);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(300);
		System.out.println(conseguiuRetirar);

		contaDoPaulo.saca(300);

		boolean conseguiuRetirar2 = contaDoPaulo.saca(30);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar2);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		System.out.println("Neste momento a conta da Marcela tem um saldo de: " + contaDaMarcela.saldo);

		System.out.println("Neste momento a conta do Paulo  tem um saldo de: " + contaDoPaulo.saldo);
		

		contaDaMarcela.transfere(321, contaDoPaulo); // como esse método é um boolean, eu posso meter ele dentro de um IF

		if(contaDaMarcela.transfere(21, contaDoPaulo)) {
			System.out.println("Transferência Realizada com sucesso");
		} else { 
			System.out.println("Transfência falhou por falta de fundos");
		}

		
		System.out.println("Neste momento a conta da Marcela tem um saldo de: " + contaDaMarcela.saldo);

		System.out.println("Neste momento a conta do Paulo  tem um saldo de: " + contaDoPaulo.saldo);

		contaDoPaulo.titular = "Paulão do Caminhão";
		contaDaMarcela.titular = "Marcela Banguela"; 
		
		System.out.println(contaDoPaulo.titular);
		System.out.println(contaDaMarcela.titular);
		
		
		
	}

}
