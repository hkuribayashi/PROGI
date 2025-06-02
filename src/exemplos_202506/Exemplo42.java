package exemplos_202506;

import java.util.Scanner;

public class Exemplo42 {
    public static boolean verificarTriangulo(double x, double y,
                                             double z){
        if (x < y+z || y < x+z || z < y+x){
            return true; // x, y, e z formam um triângulo
        }else return false; // x, y, e z não formam um triângulo
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um lado do triângulo (x): ");
        double x = leitor.nextDouble();
        System.out.println("Informe um lado do triângulo (y): ");
        double y = leitor.nextDouble();
        System.out.println("Informe um lado do triângulo (z): ");
        double z = leitor.nextDouble();

        if (verificarTriangulo(x, y, z)){
            if (x == y && y == z){
                System.out.print("O triângulo é equilátero");
            }else if (x != y && y != z && z != x){
                System.out.print("O triângulo é escaleno");
            }else System.out.print("O triângulo é isósceles");
        }else{
            System.out.println("x, y e z não formam um triângulo");
        }
    }
}
