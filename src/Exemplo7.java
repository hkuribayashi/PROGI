/*
Questão 06: Leia os quatro valores correspondentes aos eixos x e y de
dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a
distância entre eles, mostrando 4 casas decimais, segundo a fórmula
da distância euclidiana entre dois pontos.
*/

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o x1");
        double x1 = leitor.nextDouble();

        System.out.println("Informe o y1");
        double y1 = leitor.nextDouble();

        System.out.println("Informe o x2");
        double x2 = leitor.nextDouble();

        System.out.println("Informe o y2");
        double y2 = leitor.nextDouble();

        double soma = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
        double distancia = Math.sqrt(soma);

        System.out.print("A distancia é "+distancia);

        System.out.printf("A distancia é %.2f%n", distancia);
    }
}
