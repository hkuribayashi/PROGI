package exemplos_202505;

import java.util.Scanner;

public class Exemplo31 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdC1 = 0;
        int qtdC2 = 0;
        int qtdC3 = 0;
        int qtdC4 = 0;
        int qtdNulos = 0;
        int qtdBrancos = 0;
        while (true) {
            System.out.print("Digite um voto:");
            int voto = leitor.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    qtdC1++;
                    break;
                case 2:
                    qtdC2++;
                    break;
                case 3:
                    qtdC3++;
                    break;
                case 4:
                    qtdC4++;
                    break;
                case 5:
                    qtdNulos++;
                    break;
                case 6:
                    qtdBrancos++;
                    break;
                default: System.out.println("voto invalido");
            }
        }

        System.out.println("Qtd. de votos C1: " + qtdC1);
        System.out.println("Qtd. de votos C2: " + qtdC2);
        System.out.println("Qtd. de votos C3: " + qtdC3);
        System.out.println("Qtd. de votos C4: " + qtdC4);
        System.out.println("Qtd. de votos Nulo: " + qtdNulos);
        System.out.println("Qtd. de votos Brancos: " + qtdBrancos);
    }
}
