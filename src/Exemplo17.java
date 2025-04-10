import java.util.Scanner;
public class Exemplo17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maior, meio, menor;

        System.out.println("Informe o primeiro valor");
        int a = leitor.nextInt();
        System.out.println("Informe o segundo valor");
        int b = leitor.nextInt();
        System.out.println("Informe o terceiro valor");
        int c = leitor.nextInt();

        if (a <= b && a <= c){
            menor = a;
            if (b <= c){
                meio = b;
                maior = c;
            }else{
                meio = c;
                maior = b;
            }
        }else if (b <= a && b <= c){
            menor = b;
            if (a <= c){
                meio = a;
                maior = c;
            }else{
                meio = c;
                maior = a;
            }
        }else{
            menor = c;
            if (a <= b){
                meio = a;
                maior = b;
            }else{
                meio = b;
                maior = a;
            }
        }

        System.out.println("O maior número é "+maior);
        System.out.println("O menor número é "+menor);
        System.out.println("O número do meio é "+meio);
    }
}
