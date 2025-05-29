package exemplos_202505;

public class Exemplo38 {

    public static boolean saoMultiplos(int a, int b){
        if (a <= 0 || b <= 0) {
            return false;
        }

        if (a % b == 0 || b % a == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 0, b = -10;
        boolean resultado = saoMultiplos(a, b);
        System.out.println(resultado);
    }
}
