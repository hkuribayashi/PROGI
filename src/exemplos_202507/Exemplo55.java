package exemplos_202507;

import java.util.Scanner;

public class Exemplo55 {

    public static int[][] criarArray(int nLinhas, int nColunas) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[nLinhas][nColunas];
        for (int i = 0; i < nLinhas; i++) {
            for (int j = 0; j < nColunas; j++) {
                System.out.print("Elemento da linha "+i+"e Coluna "+j+":");
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int[][] matriz = criarArray(2, 3);
       imprimirMatriz(matriz);
    }
}
