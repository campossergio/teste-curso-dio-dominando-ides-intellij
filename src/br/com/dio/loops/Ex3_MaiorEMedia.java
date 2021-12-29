package br.com.dio.loops;

/*
    FAÇA UM PROGRAMA QUE LEIA 5 NÚMEROS E INFORME O MAIOR NÚMERO E A MÉDIA DESSES NÚMEROS.
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner inserirNumeros = new Scanner(System.in);

        int numero;

        int contador = 0;
        int maiorNumero = 0;
        float soma = 0;
        float media = 0;

        do {
            System.out.println("Número: ");
            numero = inserirNumeros.nextInt();
            contador += 1;

            if(numero >= maiorNumero){
                System.out.println("O maior número é: " + numero);
                maiorNumero = numero;
            } else {
                System.out.println("O maior número é: " + maiorNumero);
            }

            soma += numero;
            media = soma / contador;
            System.out.println("A média dos números são: " + media);

        } while(contador < 5);
    }
}
