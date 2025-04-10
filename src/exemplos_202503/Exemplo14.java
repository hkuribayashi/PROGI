package exemplos_202503;/*
Questão 06: Leia 4 valores inteiros A, B, C e D. A seguir, se B for
maior do que C e se D for maior do que A, e a soma de C com D for
maior que a soma de A e B e se C e D, ambos, forem positivos e se a
variável A for par escrever a mensagem "Valores aceitos", senão
escrever "Valores nao aceitos
 */
import java.util.Scanner;

public class Exemplo14 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        int A = leitor.nextInt();

        System.out.println("Informe o valor de B");
        int B = leitor.nextInt();

        System.out.println("Informe o valor de C");
        int C = leitor.nextInt();

        System.out.println("Inoforme o valor de D");
        int D = leitor.nextInt();

        if (B > C || D > A && (C+D > A+B) && C > 0 && D > 0 && A%2==0 ){
            System.out.println("Valores Aceitos");
        }else{
            System.out.println("Valores não aceitos");
        }
    }
}
