package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException   {

		 
		//Fluxo de Entrada com Arquivo
		
		InputStream fis = new FileInputStream("lorem.txt");  //Não compila de cara, ele pede um tratamento de excessão... vou ter que botar o throws FileNotFoundException  
		//O FileInputStream vai me voltar inteiros, não me retorna o texto e não resolve o meu problema... para um uso melhor, tenho que ir para o InputStreamReaded
		Reader isr = new InputStreamReader(fis);// Ou seja, criamos um objeto responsável pela entrada do objeto... e agora vamos criar um outro para a leitura que vai receber este de entrada como parâmetro no construtor
		BufferedReader  br =  new BufferedReader(isr); //O problema é que o reader lê caractere por caractere... isso não é o que queremo, queremos o texto todo, daí o porque usar um buffer, pra guardar e lançar o texto de uma vez 
	
	
		String linha = br.readLine(); // Vai ler uma linha só 
		
		
		while (linha != null) { // quando o stream não tem mais o que ler, ele retorna Null. neste momento queremos que ele pare, saia do nosso while que manda ler o buffer todo. 
			
			System.out.println(linha);
			linha = br.readLine();
			
		}
			
		
		br.close(); //Se eu abri uma entrada para o Buffer, eu tenho que fechar no final. fechando o buffer, o resto tb é fechado.  
	
	
	
	}

}
