package exemplos_202505;

import java.util.Scanner;
public class Exemplo33 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0.0;
        System.out.println("Digite o numero de pessoas: ");
        int tamanho = leitor.nextInt();
        double[] altura = new double[tamanho];

        for (int i=0; i <=tamanho-1; i++){
            System.out.println("Digite uma altura");
            altura[i] = leitor.nextDouble();
        }

        for (int i=0; i <=tamanho-1; i++){
            media = media + altura[i];
        }

        media = media / altura.length;
        System.out.println("O valor da altura média é " + media);

     }
}
