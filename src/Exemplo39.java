import java.util.Scanner;
public class Exemplo39 {

    public static int calcularProximaCopa(int n){
        int ano = 1930;
        ano = ano + 4 * n;
        return ano;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor de n");
        int n = leitor.nextInt();
        System.out.print("Ano da n-copa é: "+calcularProximaCopa(n));
    }
}
