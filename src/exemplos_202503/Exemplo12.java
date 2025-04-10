package exemplos_202503;

import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a media");
        double media = leitor.nextDouble();

        if (media > 8){
            System.out.println("Aprovado");

        }else{
            System.out.println("REPROVADO");
        }

    }
}
