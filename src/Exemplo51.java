import java.util.Scanner;

public class Exemplo51 {

    public static char[] criarArray() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o tamanho do array: ");
        int tamanho = leitor.nextInt();
        char[] meuarray = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe uma letra: ");
            meuarray[i] = leitor.next().charAt(0);
        }
        return meuarray;
    }
    
    public static boolean verificarPalidromo(char[] meuarray) {
        return  false;
    }

    public static void main(String[] args) {

    }
}
