package exemplos_202505;

import java.util.Scanner;
public class Exemplo28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();
        int primeiro = 0;
        int segundo = 1;
        int contador = 0;
        while (contador < numero) {
            System.out.println(primeiro);
            int terceiro = primeiro + segundo;
            primeiro = segundo;
            segundo = terceiro;
            contador++;
        }
    }
}