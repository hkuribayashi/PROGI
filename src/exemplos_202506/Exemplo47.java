package exemplos_202506;/*
Questão 01: Crie um programa que leia 5 números inteiros e armazene em
um array. Em seguida, calcule e exiba a soma de todos os valores
presentes no array.
*/
import java.util.Scanner;

public class Exemplo47 {

    public static int[] criarArray(){
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    /* Função que calcula a soma dos elementos de um array */
    public static int calcularSoma(){
        int[] vetor = criarArray();
        int posicao = 0;
        int soma = 0;
        while(posicao < vetor.length){
            soma = vetor[posicao] + soma;
            posicao = posicao + 1; //posicao++
        }
        return soma;
    }

    public static void main(String[] args) {
        int resultadoSoma = calcularSoma();
        System.out.println("O resultado da soma: "+resultadoSoma);
    }
}
