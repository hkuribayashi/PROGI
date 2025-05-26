package exemplos_202505;

import java.util.Scanner;
public class Exemplo35 {

    public static int fat(int numero){
        int fatorial = 1;
        for (int i=numero; i>=1; i--){
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = leitor.nextInt();

        double e = 1 +
                  (1.0/fat(1)) +
                  (1.0/fat(2)) +
                  (1.0/fat(3)) +
                  (1.0/fat(n));
        System.out.println(e);
    }
}