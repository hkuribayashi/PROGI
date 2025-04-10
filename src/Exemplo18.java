/*
Questão 05: Leia 2 valores inteiros (A e B). Após, o programa deve
mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando
 se os valores lidos são múltiplos entre si.
*/
import java.util.Scanner;
public class Exemplo18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor de a");
        int a = leitor.nextInt();

        System.out.println("Informe o valor de b");
        int b = leitor.nextInt();

        if ( a % b == 0 ||  b % a ==0){
            System.out.println("Multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}
