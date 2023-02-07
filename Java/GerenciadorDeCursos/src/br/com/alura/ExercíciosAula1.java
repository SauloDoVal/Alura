package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class ExercíciosAula1 {
	
	public static void main(String[] args) {
		
		String curso1 = "Java 8 em detalhes";
		String curso2 = "Executando testes em Java";
		String curso3 = "Como não pirar estudando e buscando emprego"; 
		
		
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
		cursos.remove(1);
		
		System.out.println(cursos);
		
        System.out.println("O primeiro curso da lista eh o: "); // como acessar o primeiro valor?
        System.out.println(cursos.get(0));
        
        
        // Esse código vai me gerar um IndexOutOfBoundsException por conta do (<=), para resolver só precisamos tirar o igual para evitar que itere para além dos limites do array. 
//        for (int i = 0; i <= cursos.size(); i++) {  
//            System.out.println("Aula : " + cursos.get(i));
//        }
		
        //Agora Vai:
        for (int i = 0; i < cursos.size(); i++) {  
            System.out.println("Aula : " + cursos.get(i));
        }
		
        
        System.out.println(cursos); // Antes da Ordem Alfabética ser imposta 
        Collections.sort(cursos);
        System.out.println(cursos); // Depois da Ordem Alfabética ser imposta 
        
        
	}

}
