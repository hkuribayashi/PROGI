/*
Questão 03: Crie um algoritmo que leia três números e calcule a média aritmética destes números. Em seguida imprima o
valor da média na tela.
*/
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Esta linha equivale a ESCREVA("Informe o primeiro número")
        System.out.println("Informe o primeiro número");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável primeiroNumero como sendo do tipo double (número decimal)
        // 2. A variável primeiroNumero recebe o valor que digitarmos no teclado durante a execução do programa
        double primeiroNumero = leitor.nextDouble();

        // Esta linha equivale a ESCREVA("Informe o segundo número")
        System.out.println("Informe o segundo número");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável segundoNumero como sendo do tipo double (número decimal)
        // 2. A variável segundoNumero recebe o valor que digitarmos no teclado durante a execução do programa
        double segundoNumero = leitor.nextDouble();

        // Esta linha equivale a ESCREVA("Informe o terceiro número")
        System.out.println("Informe o terceiro número");

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável terceiroNumero como sendo do tipo double (número decimal)
        // 2. A variável terceiroNumero recebe o valor que digitarmos no teclado durante a execução do programa
        double terceiroNumero = leitor.nextDouble();

        // Nesta linha fazemos duas coisas:
        // 1. Declaramos a variável média como sendo do tipo double (número decimal)
        // 2. A variável média recebe o valor da média calculada com os 3 números informados
        double media = (primeiroNumero + segundoNumero + terceiroNumero)/3;

        // Esta linha equivale a ESCREVA("O valor da média é "+media)
        System.out.println("O valor da média é "+media);
    }
}
