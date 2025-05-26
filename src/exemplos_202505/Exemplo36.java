package exemplos_202505;

public class Exemplo36 {

    public static void tabuada(int num){
        int contador = 1;
        while (contador <= 10){
            System.out.println(num+" x "+contador+"="+num*contador);
            contador++;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            tabuada(i);
        }

    }
}
