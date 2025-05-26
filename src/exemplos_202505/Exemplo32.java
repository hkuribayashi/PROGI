package exemplos_202505;

public class Exemplo32 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 5) {
            contador++;
            if (contador == 3 || contador == 2)
                continue;
            System.out.println("Número: "+contador);
        }
    }
}
