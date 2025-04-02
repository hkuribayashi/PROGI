/*
Questão 01: Desenvolva um algoritmo que leia a base e a altura de um retângulo. Em seguida, calcule sua área
(base x altura) e imprima o valor na tela do computador.
*/

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        // Esta linha equivale a ESCREVA("Informe o valor da base:")
        System.out.print("Informe o valor da base:");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável base como sendo do tipo double (número decimal)
        // 2. A variável base recebe o valor que digitarmos no teclado durante a execução do programa
        double base = leitor.nextDouble();

        // Esta linha equivale a ESCREVA("Informe o valor da altura:")
        System.out.print("Informe o valor da altura:");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável altura como sendo do tipo double (número decimal)
        // 2. A variável altura recebe o valor que digitarmos no teclado durante a execução do programa
        double altura = leitor.nextDouble();

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável area como sendo do tipo double (número decimal)
        // 2. A variável area recebe o valor da multiplicação entre o valor da base e da altura
        double area = base * altura;

        // Esta linha equivale a ESCREVA("O valor da área é "+area)
        System.out.print("O valor da área é "+area);
    }
}
