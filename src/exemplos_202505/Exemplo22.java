package exemplos_202505;

public class Exemplo22 {
    public static void main(String[] args) {
        int primeiro = 1;
        while (primeiro <= 10) {
            int segundo = 1;
            while (segundo <= 10) {
                int produto = primeiro * segundo;
                System.out.println(primeiro+ " x "+segundo+" = "+produto);
                segundo++;
            }
            primeiro++;
        }


    }
}
