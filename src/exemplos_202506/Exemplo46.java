package exemplos_202506;

import java.util.Random;

/*
Questão 06: Crie um vetor de 10 posições com números inteiros
gerados aleatoriamente (entre 1 e 100). Escreva uma função que
receba um valor inteiro (soma) e devolva um valor booleano
verdadeira (true) caso encontre dois valores do array que somados
sejam iguais a soma. Dica: Use dois laços de repetição.
 */
public class Exemplo46 {

    public static int[] criarVetor() {
        Random gerador = new Random(42);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = gerador.nextInt(1, 101);
        }
        return vetor;
    }

    public static boolean buscarSoma(int soma) {
        int[] vetor = {1, 14, 43, 26, 71, 90, 48, 33, 20, 55, 8};

        // laço mais externo
        for (int i = 0; i < 10; i++) {
            for (int j=0; j<10; j++){
                if (i != j && vetor[i] + vetor[j]==soma)
                    return true;
            }
        }
        return false;
    }

    public static boolean buscarSomaV2(int soma) {
        int[] vetor = {1, 14, 43, 26, 71, 90, 48, 33, 20, 55, 8};
        int menor = 0;
        int maior = vetor.length - 1;
        boolean resultado = false;

        while (menor < maior) {
            int teste = vetor[menor] + vetor[maior];
            if (teste == soma){
                resultado = true;
                break;
            }else menor += 1;

            if (menor == maior){
                menor = 0;
                maior = maior - 1;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        boolean resultado = buscarSoma(56);
        System.out.println(resultado);
    }
}
