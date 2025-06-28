package exemplos_202506;

import java.util.Scanner;

public class Exemplo49 {

    /*
    Devolver verdadeiro caso o número seja primo. E, falso, caso contrário
     */
    public static boolean ehPrimo(int n) {
        if (n == 1){
            return true;
        }else {
            for (int i=2; i<n; i++){
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static int[] criarArray(){
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[4];
        for (int i=0; i<vetor.length; i++){
            System.out.println("Digite o valor da posição "+i+": ");
            vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    public static boolean ehPar(int n) {
        if (n % 2 == 0){
            return true;
        }else return false;
    }
}