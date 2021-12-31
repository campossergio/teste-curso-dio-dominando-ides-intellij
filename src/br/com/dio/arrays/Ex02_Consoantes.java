package br.com.dio.arrays;

/*
    FAÇA UM PROGRAMA QUE LEIA UM VETOR DE 6 CARACTERES, E DIGA QUANTAS CONSOANTES FORAM LIDAS.
    IMPRIMA AS CONSOANTES.
 */

import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner consoantes = new Scanner(System.in);

        String[] letras = new String[6]; // ARRAY DE STRING COM 6 POSIÇÕES
        int quantidadeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("Letra: ");
            String letra = consoantes.next();

            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                letras[contador] = letra;
                quantidadeConsoantes++;
            }
            contador++;
        } while(contador < letras.length);

        for (String consoante : letras) {
            if(consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de Consoantes: " + quantidadeConsoantes);
    }
}
