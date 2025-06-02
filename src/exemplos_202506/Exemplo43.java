package exemplos_202506;

public class Exemplo43 {

    public static int anoBissexto(int n) {
        int ano = -45;
        while (n > 0) {
            ano = ano + 4;
            n--;
        }
        return ano;
    }

    public static void main(String[] args) {
        System.out.print( anoBissexto(2) );
    }
}
