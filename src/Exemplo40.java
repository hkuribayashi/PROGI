public class Exemplo40 {

    public static void calcularMedia(double nota1, double nota2,
                                     double nota3, char tipoMedia) {
        if (tipoMedia == 'A') {
            System.out.println("Média Aritmética");
            double mediaAritm = (nota1 + nota2 + nota3)/3;
            System.out.println( mediaAritm );
        }else{
            System.out.println("Média Ponderada");
            double mediaPon = nota1*5 + nota2*3 + nota3*2;
            System.out.print(mediaPon/10);
        }
    }

    public static void calcularMedia2(double nota1, double nota2,
                                      double nota3, char tipoMedia){
        int peso1 = 1;
        int peso2 = 1;
        int peso3 = 1;
        String mensagem = "Média Aritmética";
        if (tipoMedia == 'P') {
            peso1 = 5;
            peso2 = 3;
            peso3 = 2;
            mensagem = "Média Ponderada";
        }
        System.out.print(mensagem);
        double media =  nota1*peso1 + nota2*peso2 + nota3*peso3;
        System.out.println(media/(peso1 + peso2 + peso3));
    }

    public static void main(String[] args) {
        calcularMedia(7.0, 5.0, 8.5, 'A');
        calcularMedia2(7.0, 5.0, 8.5, 'A');
    }
}
