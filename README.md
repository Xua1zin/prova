# prova
## Questões:
1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  


## Respostas:
1 e 2 estão no arquivo src/main/java/org/example

3) 77.
4) a) 1, 3, 5, 7, 9.  (R: 9, prox = n + 2)
b) 2, 4, 8, 16, 32, 64, 128. (R: 128, prox = n * 2)
c) 0, 1, 4, 9, 16, 25, 36, 49. (R: 49, n = n^2)
d) 4, 16, 36, 64, 100. (R: 100, par^2)
e) 0, 1, 1, 2, 3, 5, 8, 13. (R: 13, Fibonacci, só soube por causa da primeira questão)
f) 2,10, 12, 16, 17, 18, 19, 200. (R: 200, todas começam com a letra D)

5) 1. Ligaria o primeiro interruptor, esperaria uns minutos e apagaria;
   2. Ligaria o segundo e iria para uma das salas, se estiver acesa, é controlado pelo segundo, se estiver apagada, mas quente, é controlado pelo primeiro, e se estiver fria, pelo terceiro;
   3. Iria para a próxima, digamos que na primeira sala que eu fui, estava apagada e fria, então sobra duas alternativas, se estiver apagada é o primeiro, se estiver acesa é o segundo.
