package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		String codeChar = "Ç";	
		
		System.out.println(codeChar.codePointAt(0));
		
		Charset charset =Charset.defaultCharset();
		System.out.println(charset);
		
		byte[] bytes = codeChar.getBytes("UTF-8");
		System.out.println(bytes.length + " UTF-8");
		
		String sNovo = new String(bytes, "UTF-8" ); // Não é boa prática vc usar um contrutor de Strings, mas para este caso de bytes pode ser necessário
		System.out.println(sNovo);// Vai imprimir "C" o codeChar definido la em cima... que estava no nosso array 		
		
		sNovo = new String(bytes, "UTF-16" );
		System.out.println(sNovo); // Aqui vai dar ruim, um caractere desconhecido, pq não é o mesmo charcode... 
		//se eu botar o windows-1252" da bom, pq usa o mesmo charcode que o UTF-8 neste caso
		
		sNovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(sNovo); //
		
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo); //
		
		
		bytes = codeChar.getBytes("windows-1252");
		System.out.println(bytes.length + " windows-1252");
		
		bytes = codeChar.getBytes("UTF-16");
		System.out.println(bytes.length + " UTF-16");
		
		bytes = codeChar.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");
		
	} 
}
