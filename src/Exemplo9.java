/*
Questão 08: Leia um valor inteiro, que é o tempo de duração em
segundos de um determinado evento em uma fábrica, e informe-o
expresso no formato horas:minutos:segundos.
 */

import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tempo em segundos");
        int tempoDuracao = leitor.nextInt();

        int horas = tempoDuracao / 3600;
        int resto = tempoDuracao % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
