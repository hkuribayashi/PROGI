package exemplos_202506;/*
Questão 02: Leia 10 números inteiros e armazene em um array. Depois,
exiba o maior e o menor valor contido nesse array.
*/
import java.util.Scanner;
public class Exemplo48 {

    public static int[] criarArray(){
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i=0; i<vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    /* Procurar dentro de vetor, qual o menor valor */
    public static int menorValor(int[] vetor){
        int menorValor = Integer.MAX_VALUE;
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] < menorValor)
                menorValor = vetor[i];
        }
        return menorValor;
    }

    /* Procurar dentro do vetor, o maior valor */
    public static int maiorValor(int[] vetor){
        int maiorValor = Integer.MIN_VALUE;
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] > maiorValor)
                maiorValor = vetor[i];
        }
        return maiorValor;
    }

    public static void main(String[] args) {
        int[] meuVetor = criarArray();
        int menorValor = menorValor(meuVetor);
        int maiorValor = maiorValor(meuVetor);
        System.out.println("Maior valor da vetor: "+maiorValor);
        System.out.println("Menor valor da vetor: "+menorValor);
    }
}
