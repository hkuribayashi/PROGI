import java.util.Scanner;

public class Exemplo20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = leitor.nextInt();
        int primeiro = x;
        System.out.print("Digite outro numero: ");
        int y = leitor.nextInt();

        int soma = 0;
        while (x <= y){
            if (x % 2 != 0){
                soma += x;
            }
            x++; //x = x + 1;
        }
        System.out.print("A soma de todos os números imparares "+
                "entre "+primeiro+" e "+y+" = "+soma);
    }
}
