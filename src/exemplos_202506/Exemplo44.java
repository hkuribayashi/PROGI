package exemplos_202506;

public class Exemplo44 {

    public static int fatorial(int n) {
        if (n == 0)
            return 1;
        else return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println( fatorial(5) );
    }
}
