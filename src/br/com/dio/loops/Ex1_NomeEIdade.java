package br.com.dio.loops;

/*
    FAÇA UM PROGRAMA QUE LEIA CONJUNTOS DE DOIS VALORES,
    O PRIMEIRO REPRESENTANDO O NOME DO ALUNO E O  SEGUNDO REPRESENTANDO A SUA IDADE.
    (PARE INSERINDO O VALOR 0 NO CAMPO NOME)
 */

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = ler.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = ler.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
