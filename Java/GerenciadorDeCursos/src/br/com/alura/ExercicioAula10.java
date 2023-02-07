package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioAula10 {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
        
        for (String value : pessoas.values()) {
        	  System.out.println(value);
        	}
        
        
        
        for (Integer key : pessoas.keySet()) {
        	  System.out.println(key + "-> " + pessoas.get(key));
        	}
        
        
        
        for (Map.Entry<Integer, String> entry : pessoas.entrySet()) {
        	  System.out.println(entry.getKey() + ": " + entry.getValue());
        	}
        
        
        
        
    }
}