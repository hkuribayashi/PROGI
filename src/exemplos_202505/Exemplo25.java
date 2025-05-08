package exemplos_202505;/*
Questão 04: Escreva um algoritmo que exiba na tela (utilizar o comando
ESCREVA) os números inteiros existentes entre 0 e N, onde N é um número
informado pelo usuário (utilizar o comando LEIA) e N > 0. Porém agora a
contagem deve ser feita em saltos. Por exemplo, entre 0 e 100, podemos
contar de 10 em 10, como em: 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 e 100.
Assim, o programa deve fazer a leitura do tamanho do salto. A solução deve
obrigatoriamente fazer uso do comando FOR.
*/
import java.util.Scanner;

public class Exemplo25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = leitor.nextInt();
        for (int contador =0; contador <= n; contador = contador +10){
            System.out.println(contador);
        }

    }
}
