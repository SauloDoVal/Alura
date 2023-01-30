package br.com.byteBank.BBHConta.teste;

import java.util.Random;
import java.util.Scanner;

public class TestaGame {

    public static void main(String[] args) {
        // Generate a random number for the master player
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the player to guess the number
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You guessed the number! Congratulations!");
                break;
            } else if (guess < number) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }
        }

        scanner.close();
    }
}