/*
Questão 05: Faça um programa que leia o nome de um vendedor, o seu
salário fixo e o total de vendas efetuadas por ele no mês (em
dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
suas vendas efetuadas, informar o total a receber no final do mês.
*/
import java.util.Scanner;

public class Exemplo6 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome do vendedor");
        String nome = leitor.next();

        System.out.println("Informe o salario fixo do vendedor");
        double salarioFixo = leitor.nextDouble();

        System.out.println("Informe o total de vendas do mes");
        double totalVendas = leitor.nextDouble();

        double totalReceber = salarioFixo + (totalVendas * 0.15);
        System.out.println("O tottal de "+nome+" é "+totalReceber);
    }
}
