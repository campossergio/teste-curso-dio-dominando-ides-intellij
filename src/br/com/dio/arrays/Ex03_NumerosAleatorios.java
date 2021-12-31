package br.com.dio.arrays;

/*
    FAÇA UM PROGRAM QUE LEIA 20 NÚMEROS INTEIROS (ENTRE 0 E 100) E ARMAZENE-OS NUM VETOR.
    AO FINAL MOSTRE OS NÚMEROS E SEUS SUCESSORES.
 */

import java.util.Random;

public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];
        
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios");
        for ( int numero: numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessores dos Números Aleatórios");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero-1) + " ");
        }
    }
}
