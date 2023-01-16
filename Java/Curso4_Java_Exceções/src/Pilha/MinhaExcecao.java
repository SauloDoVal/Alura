package Pilha;

public class MinhaExcecao extends Exception { //Checked, it would be  Uncheched if it had extended from RuntimeExpection 

	
	public MinhaExcecao(String msg) {
		super(msg); // Just coping the procedure on line 62 of RuntimeExpetion and sending this message upstairs, to a higher class. 
		
	}

}
