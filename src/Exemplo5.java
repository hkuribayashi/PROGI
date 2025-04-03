/*
Questão 04: Escreva um programa que leia o nome de um
funcionário, seu número de horas trabalhadas, o valor que
recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o nome e o salário do funcionário.
*/
import java.util.Scanner;

public class Exemplo5 {

    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);

        // ESCREVA("Informe o nome do funcionario")
        System.out.println("Informe o nome do funcionario");
        String nome = leitor.next();

        System.out.println("Informe a quantidade de horas");
        int qtdHoras = leitor.nextInt();

        System.out.println("Informe o valor de R$ por hora");
        double valorHora = leitor.nextDouble();

        double salario = qtdHoras * valorHora;
        System.out.println("O Salario de "+nome+" é "+salario);
    }

}
