package br.com.dio.arrays;

/*
    CRIE UM VETOR DE 6 NÚMEROS E MOSTR-OS NA ORDEM INVERSA.
 */

public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60}; // VETOR UNIDIMENSIONAL

        int contador = 0;
        while(contador < vetor.length){
            System.out.println(vetor[contador]);
            contador++;
        }

        System.out.println("Vetor em Ordem Inversa");
        for(int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
