package br.com.dio.loops;

/*
  FAÇA UM PROGRAMA QUE PEÇA N NÚMEROS INTEIROS, CALCULE  E MOSTRE A QUANTIDADE DE
  NÚMEROS PARES E A QUANTIDADE DE NÚMEROS ÍMPARES.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner parImpar = new Scanner(System.in);

        int numeros;
        int somaPares = 0;
        int somaImpares  = 0;
        int quantNumeros;
        int contador = 0;

        System.out.println("Digite a qunatidade de números inteiros que serão digitados!!!");
        quantNumeros = parImpar.nextInt();

        while(contador < quantNumeros) {
            System.out.println("Número: ");
            numeros = parImpar.nextInt();

            if(numeros % 2 == 0) {
                somaPares += 1;
            } else {
                somaImpares += 1;
            }
            contador++;
        }
        System.out.println("O total de números Pares digitados foram: " + somaPares);
        System.out.println("O total de números Ímpares digitados foram: " + somaImpares);
    }
}
