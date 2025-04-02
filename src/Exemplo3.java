/*
Questão 02: Faça um algoritmo que leia o raio da base e a altura de um cilindro. Em seguida, calcule seu volume
(pi * raio * raio * altura) e imprima seu valor na tela do computador.
*/
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Esta linha equivale a ESCREVA("Informe o valor da base do cilindro")
        System.out.println("Informe o valor da base do cilindro:");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável raio como sendo do tipo double (número decimal)
        // 2. A variável raio recebe o valor que digitarmos no teclado durante a execução do programa
        double raio = leitor.nextDouble();

        // Esta linha equivale a ESCREVA("Informe o valor da altura do cilindro")
        System.out.println("Informe o valor da altura do cilindro:");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável altura como sendo do tipo double (número decimal)
        // 2. A variável altura recebe o valor que digitarmos no teclado durante a execução do programa
        double altura = leitor.nextDouble();

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável volume como sendo do tipo double (número decimal)
        // 2. A variável volume recebe o valor da multiplicação entre o valor do raio * raio * altura e PI
        double volume = raio * raio * altura * Math.PI;

        // Esta linha equivale a ESCREVA("O valor do volume do cilindro é "+volume)
        System.out.println("O valor do volume do cilindro é "+volume);
    }
}
