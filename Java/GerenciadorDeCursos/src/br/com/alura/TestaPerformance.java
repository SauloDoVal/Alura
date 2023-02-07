package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {

    public static void main(String[] args) {

    	Collection<Integer> numeros = new LinkedList<>(); // Troque HashSet por ArrayList pra ver como demora muuuutio mais com o Arraylist, com LinkedList ainda mais 

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}