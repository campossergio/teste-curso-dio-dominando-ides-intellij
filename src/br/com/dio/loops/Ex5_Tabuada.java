package br.com.dio.loops;

/*
    DESENVOLVA UM GERADO DE TABUADA, CAPAZ DE GERAR A TABUADA DE QUALQUER NÚMERO INTEIRO
    ENTRE 1 E 10.
    O USUÁRIO DEVE INFORMAR DE QUAL NÚMERO ELE DESEJA VER A TABUADA.
    A SAÍDA DEVE SER CONFORME O EXEMPLO ABAIXO:

    TABUADA DE 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner valorTabuada = new Scanner(System.in);
        System.out.println("TABUADA");

        int tabuada;
        int multiplicador;
        int contador = 0;

        System.out.println("Qual tabuada você quer saber o resultado!!!");
        tabuada = valorTabuada.nextInt();
        System.out.println("Tabuada do " + tabuada);

        while(contador <= 10) {
            multiplicador = tabuada * contador;
            System.out.println(tabuada + " X " + contador + " = " + multiplicador);
            contador++;
        }

        System.out.println("TABUADA COM FOR");
        for(int i = 0; i <= 10; i++) {
            multiplicador = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + multiplicador);
        }
    }
}
