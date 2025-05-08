package exemplos_202505;/*
Questão 08: Escreva um algoritmo que leia dois números. Caso o
primeiro número seja menor que o segundo, faça a contagem dos números
(Exemplo: 1, 2, 3, 4, 5, 6). Caso contrário, se o segundo número for
menor que o primeiro, a contagem deve ser feita de modo inverso
(Exemplo: 6, 5, 4, 3, 2, 1). A solução deve obrigatoriamente fazer
uso do comando for.
*/
import java.util.Scanner;

public class Exemplo26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiro = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundo = leitor.nextInt();
        if (primeiro < segundo) {
            for (int i = primeiro; i <= segundo; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = primeiro; i >= segundo; i--) {
                System.out.println(i);
            }
        }
    }
}
