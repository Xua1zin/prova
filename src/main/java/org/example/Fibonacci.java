package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //define numeroScanneado como scanner, para poder capturar o que escrever no terminal
        Scanner numeroScanneado = new Scanner(System.in);

        //Printa o pedido de um numero
        System.out.println("Informe um numero: ");

        //Inicia numero como inteiro para receber um inteiro que foi escrito no terminal
        int numero = numeroScanneado.nextInt();

        //inicia um boolean chamado fibonacci, poderia ter feito direto no if, mas assim fica melhor de entender
        boolean fibonacci = fibonacciCheck(numero);

        //verifica se fibonacci é verdadeiro, se for, retorna uma string dizendo que faz parte, caso não, dizendo que não faz
        if (fibonacci) {
            System.out.println("O numero " + numero + " faz parte da sequência de Fibonacci");
        } else {
            System.out.println("O numero " + numero + " não faz parte da sequência de Fibonacci");
        }
    }

    public static boolean fibonacciCheck(int numero){
        int i = 0;
        int j = 1;

        //inicia uma estrutura de repetição que diz que enquanto i for menor ou igual ao numero escolhido, ele verifica se i é o numero, se for,
        //retorna verdadeiro, se não for, ele soma o proximo e verifica novamente, até o i ultrapassar o valor do numero, o que quer dizer que
        //é impossível o numero escolhido ser o próximo da sequência de Fibonacci
        while(i <= numero){
            if(i == numero){
                return true;
            }
            int proximo = i + j;
            i = j;
            j = proximo;
        }
        return false;
    }
}
