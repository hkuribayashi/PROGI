public class Exemplo23 {

    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            if (contador % 2 == 0) {
                System.out.println("O número " + contador + " é par");
            }
            contador++;
        }

        System.out.println();

        for (int numero=1; numero<=10; numero++) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par");
            }
        }
    }
}
