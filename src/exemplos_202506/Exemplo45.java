package exemplos_202506;

import java.util.Scanner;
public class Exemplo45 {

    public static double[] criaArray() {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = leitor.nextDouble();
        }
        return notas;
    }
    
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i=0; i<notas.length;  i++) {
            soma += notas[i];
        }
        return soma/notas.length;
    }

    public static void main(String[] args) {
        double[] minhasNotas = criaArray();
        double media = calcularMedia( minhasNotas );
    }

}