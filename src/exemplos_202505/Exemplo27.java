package exemplos_202505;/*
Questão 08: Escreva um algoritmo que Leia 1 valor inteiro N, que representa o número
de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada
um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem
peso 3 e o terceiro valor tem peso 5.
 */
import java.util.Scanner;
public class Exemplo27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = leitor.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Informe o primeiro numero: ");
            float primeiro = leitor.nextFloat();
            System.out.println("Informe o segundo numero: ");
            float segundo = leitor.nextFloat();
            System.out.println("Informe o terceiro numero: ");
            float terceiro = leitor.nextFloat();
            float media = (primeiro *2 + segundo *3  + terceiro * 5)/10;
            System.out.print(media);
        }
    }
}
