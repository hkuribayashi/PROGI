package exemplos_202505;

import java.util.Scanner;
public class Exemplo39 {

    public static int calcularProximaCopa(long n){
        int ano = 1930;
        while(n > 0){
            ano = ano + 4;
            if (ano != 1942 && ano != 1946) {
                n = n - 1;
            }
        }
        return ano;
    }

    public static int calcularProximaCopa2(int n){
        int ano = 1930;
        ano = ano + 4 * n;
        if ( n>=3){
            ano = 1938 + (4*n);
        }
        return ano;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (true){
            System.out.println("Informe o número da edição-n: ");
            long n = leitor.nextLong();
            if (n < 0) {
                break;
            }else System.out.println("Ano da n-copa é: "+calcularProximaCopa(n));
        }
    }
}