package exemplos_202505;/*
A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
 dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00
 */
import java.util.Scanner;
public class Exemplo29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero de familias: ");
        int numeroFamilia = leitor.nextInt();

        double totalSalarios = 0.0;
        double totalFilhos = 0.0;
        double maiorSalario = 0.0;
        double percentualSalario = 0.0;

        int contador = 0;
        while (contador < numeroFamilia) {
            System.out.println("Informe o numero de filhos");
            int numeroFilho = leitor.nextInt();
            totalFilhos = numeroFilho + totalFilhos;

            System.out.println("Informe o valor do salario");
            double valorSalario = leitor.nextDouble();
            totalSalarios = totalSalarios + valorSalario;

            if (valorSalario > maiorSalario) {
                maiorSalario = valorSalario;
            }

            if (valorSalario > 0.0 && valorSalario <= 100.0){
                percentualSalario++;
            }

            contador++;
        }

        System.out.println("Média de salarios: " + totalSalarios/numeroFamilia);
        System.out.println("Média de filhos: " + totalFilhos/numeroFamilia);
        System.out.println("Maior Salario: " + maiorSalario);
        System.out.println("Percentual Salarios entre 0 e 100: "
                                            + (percentualSalario/numeroFamilia)*100 + "%");
    }
}
