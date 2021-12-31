package br.com.dio.arrays;

/*
    GERE E IMPRIMA UMA MATRIZ M 4X4 COM VALORES ALEATÓRIOS ENTRE 0-9.
 */

import java.util.Random;

public class Ex04_ArrayUnidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4]; // matriz de 4 linhas e 4 colunas

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("\nMatriz 4X4 gerada aleatóriamente...");
        for ( int[] linha : matriz ) {
            for ( int elementoDaColuna : linha ) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
