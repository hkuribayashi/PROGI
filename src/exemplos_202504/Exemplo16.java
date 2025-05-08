package exemplos_202504;

import java.util.Scanner;

public class Exemplo16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número N1");
        double n1 = leitor.nextDouble();

        System.out.println("Informe o número N2");
        double n2 = leitor.nextDouble();

        System.out.println("Informe o número N3");
        double n3 = leitor.nextDouble();

        System.out.println("Informe o número N4");
        double n4 = leitor.nextDouble();

        double media = (n1 * 2) + (n2 * 3) + (n3 * 4) + n4;
        media = media /10;
        System.out.printf("Média: %.1f%n", media);

        if (media >= 7.0){
            System.out.println("Aluno Aprovado");
        }else if (media < 5.0){
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Aluno em Exame");
            System.out.println("Informe a nota do exame");
            double notaExame = leitor.nextDouble();
            System.out.printf("Nota do Exame: %.1f%n", notaExame);
            media = (media +notaExame)/2;
            if (media >= 5.0){
                System.out.println("Aluno Aprovado");
            }else {
                System.out.println("Aluno reprovado");
            }
        }
    }
}
