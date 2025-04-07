import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a velocidade");
        double velocidade = leitor.nextDouble();

        if (velocidade > 80.0){
            System.out.println("Limite de velocidade atingido");
        }
    }
}
