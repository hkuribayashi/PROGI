package exemplos_202505;

import java.util.Scanner;
public class Exemplo30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdC1 = 0;
        int qtdC2 = 0;
        int qtdC3 = 0;
        int qtdC4 = 0;
        int qtdNulos = 0;
        int qtdBrancos = 0;
        while (true){
            System.out.print("Digite um voto:");
            int voto = leitor.nextInt();
            if (voto == 1){
              qtdC1++;
            }else if (voto == 2) {
                qtdC2++;
            }else if (voto == 3) {
                qtdC3++;
            }else if (voto == 4) {
                qtdC4++;
            }else if (voto == 5) {
                qtdNulos++;
            }else if (voto == 6) {
                qtdBrancos++;
            } else if (voto == 0) {
                break;
            }else System.out.print("Voto Inválido!");

        }

        System.out.println("Qtd. de votos C1: " + qtdC1);
        System.out.println("Qtd. de votos C2: " + qtdC2);
        System.out.println("Qtd. de votos C3: " + qtdC3);
        System.out.println("Qtd. de votos C4: " + qtdC4);
        System.out.println("Qtd. de votos Nulo: " + qtdNulos);
        System.out.println("Qtd. de votos Brancos: " + qtdBrancos);
    }
}