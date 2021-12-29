package br.com.dio.loops;

/*
    FAÇA UM PROGRAMA QUA CALCULE O FATORIAL DE UM NÚMERO INTEIRO FORNECIDO PELO USUÁRIO.
    EX,> 5! = 120
 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        System.out.println("CALCULO DE NÚMERO FATORIAL");
        Scanner fatorial = new Scanner(System.in);

        int fat;
        int valorFatorial = 1;
        int numero;

        System.out.println("Qual número você deseja saber o seu valor Fatorial?");
        fat = fatorial.nextInt();
        numero = fat;

        for(int j = 0; j < numero; j++) {
            valorFatorial = valorFatorial * fat;
            fat--;
        }
        System.out.println("O valor do Fatorial " + numero + "! é " + valorFatorial);
    }
}
