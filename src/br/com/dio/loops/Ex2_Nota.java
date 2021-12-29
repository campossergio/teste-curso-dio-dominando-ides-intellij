package br.com.dio.loops;

/*
    FAÇA UM PROGRAMA QUE PEÇA UMA NOTA, ENTRE ZERO E DEZ.
    MOSTRE  UMA MENSAGEM CASO O VALOR SEJA INVÁLIDO E CONTINUE PEDINDO ATÉ QUE O
    USUÁRIO INFORME UM VALAOR VÁLIDO.
 */

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner inserirNumeros = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = inserirNumeros.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("O valor inserido foi: " + nota);
            System.out.println("Este valor é inválido digite um valor válido entre 1 e 10.");
            nota = inserirNumeros.nextInt();
        }

        System.out.println("Nota Válida: " + nota);
    }
}
