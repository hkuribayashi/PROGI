package exemplos_202505;

import java.util.Scanner;

public class Exemplo21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();
        if (numero > 2 && numero < 1000) {
            int inicial = 1;
            while (inicial <= 10) {
               int produto = inicial * numero;
               System.out.println(inicial+" x "+numero+" = "+produto);
               inicial++;
            }
        }else{
            System.out.print("O numero informado é invalido");
        }
    }

    public static class Exemplo24 {
    
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int n = leitor.nextInt();
            for (int contador = 0; contador <= n; contador++) {
                System.out.println(contador);
            }
            
            
        }
    }
}
