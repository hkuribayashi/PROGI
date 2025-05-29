package exemplos_202505;

import java.util.Scanner;
public class Exemplo40 {

    public static void calcularMedia(double nota1, double nota2,
                                     double nota3, String tipoMedia) {
        if (tipoMedia.equals("A")) {
            System.out.println("Média Aritmética");
            double mediaAritm = (nota1 + nota2 + nota3)/3;
            System.out.println( mediaAritm );
        }else{
            System.out.println("Média Ponderada");
            double mediaPon = nota1*5 + nota2*3 + nota3*2;
            System.out.print(mediaPon/10);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite uma nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite uma nota: ");
        double nota3 = leitor.nextDouble();

        while (true){
            System.out.println("Digite o tipo de média: ");
            String tipoMedia = leitor.next();
            if (tipoMedia.equals("A") || tipoMedia.equals("P")) {
                calcularMedia(nota1,nota2,nota3,tipoMedia);
                break;
            }else System.out.println("Tipo de Média inválida");
        }

    }
}
