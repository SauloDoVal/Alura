package br.com.byteBank.BBHConta.modelo;

public interface Tributavel {
	
	
	//public abstract ==> As all the methods inside an interface are public and abstract, I don't need to add this to the method... I can, but it is implicitly there 
	double getValorImposto();

}
