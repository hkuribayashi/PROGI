import java.util.Scanner;

public class Exemplo10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a idade");
        int idade = leitor.nextInt();

        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Menor de Idade");
        }

    }
}
