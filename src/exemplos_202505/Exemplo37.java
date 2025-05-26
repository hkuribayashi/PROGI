package exemplos_202505;

public class Exemplo37 {
    /*
    * Esta função recebe um número inteiro e calcula se ele é par ou
    * não. Caso seja par devolver o valor true, e false caso contrário
    * */
    public static boolean ehNumeroPar(int numero) {
        if (numero % 2 == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        if ( ehNumeroPar(5) ){
            System.out.print("Par");
        }else System.out.print("Ímpar");
    }
}
