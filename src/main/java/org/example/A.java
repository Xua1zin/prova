package org.example;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        //Fiz um scan do terminal e salvei em stringScanneada
        Scanner stringScanneada = new Scanner(System.in);

        //Pede para escrever uma string
        System.out.println("Escreva uma string: ");

        //Atribui o scan na String string
        String string = stringScanneada.nextLine();

        //inicia um contador que vai receber o retorno da função "ContaOsAs"
        int contador = ContaOsAs(string);

        //Printa a quantidade de As
        System.out.println("A string tem " + contador + " letras As");
    }

    //Inicia a função responsável por contar os As
    public static int ContaOsAs(String string){

        //Inicia o contador como zero, porque caso não tenha nenhum A, ele imprime 0
        int contador = 0;

        //Inicia uma estrutura de repetição que vai loopar todo o tamanho da string
        for(int i = 0; i < string.length(); i++){

            //cria uma condicional que vai pegar o caracter na posição I da string
            if((string.charAt(i) == 'a') || (string.charAt(i) == 'A')){

                //adiciona 1 no contador
                contador++;
            }
        }
        //retorna o valor do contador
        return contador;
    }
}
