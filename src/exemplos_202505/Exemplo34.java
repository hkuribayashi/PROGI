package exemplos_202505;

import java.util.Scanner;

public class Exemplo34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double E = 1.0;  // Começa com 1

        System.out.print("Digite um valor inteiro e positivo para N: ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("O valor de N deve ser positivo!");
        } else {
            // fatorial de 1
            int fatorial = 1;
            for (int j = 1; j <= 1; j++) {
                fatorial *= j;
            }
            E += 1.0 / fatorial;

            // fatorial de 2
            fatorial = 1;
            for (int j = 1; j <= 2; j++) {
                fatorial *= j;
            }
            E += 1.0 / fatorial;

            // fatorial de 3
            fatorial = 1;
            for (int j = 1; j <= 3; j++) {
                fatorial *= j;
            }
            E += 1.0 / fatorial;

            // fatorial de N
            fatorial = 1;
            for (int j = 1; j <= N; j++) {
                fatorial *= j;
            }
            E += 1.0 / fatorial;

            System.out.println("O valor de E é: " + E);
        }

        scanner.close();
    }
}
