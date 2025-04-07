import java.util.Scanner;
public class Exemplo15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        double a = leitor.nextDouble();

        System.out.println("Informe o valor de B");
        double b = leitor.nextDouble();

        System.out.println("Informe o valor de C");
        double c = leitor.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }else{
            double x1 = (- b + Math.sqrt(delta))/2*a;
            double x2 = (- b - Math.sqrt(delta))/2*a;
            System.out.println("O valor de x1 é "+x1);
            System.out.println("O valor de x2 é "+x2);
        }
    }
}
