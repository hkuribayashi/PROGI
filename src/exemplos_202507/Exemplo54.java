package exemplos_202507;

import java.util.Scanner;

public class Exemplo54 {

    public static int[][] criarMatriz(int linha, int coluna) {
        int[][] matriz = new int[linha][coluna];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        int[][] minhaMatriz = criarMatriz(2, 3);
        System.out.println();
    }
}
