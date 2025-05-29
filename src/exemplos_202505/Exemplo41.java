package exemplos_202505;

public class Exemplo41 {
    /*
    * Esta função recebe tres valores double. Caso obedeça ao teoremos de pitágoras,
    * então deve retornar verdadeiro (true) e falso (false), caso contrário.
    * */
    public static boolean testaTriangulo(double hipotenusa, double cateto1,
                                                                double cateto2) {
        if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            return true;
        }else return false;

    }

    public static void main(String[] args) {
        boolean resultado = testaTriangulo(5.0, 3.0, 4.0);
        System.out.println(resultado);
    }
}
