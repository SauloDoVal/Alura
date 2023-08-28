package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
//		Cliente cliente = new Cliente(); 
//		cliente.setNome("Saulo");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("123.123.321-01");
//		
//		
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin")); 
//		
//		oos.writeObject(cliente);
//		oos.close();
		
		
		
		 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin")); 
		Cliente cliente = (Cliente) ois.readObject(); 
		System.out.println(cliente.getNome());
		ois.close();
		System.out.println(cliente.getNome());
		
		
		
		
		
	}
}
