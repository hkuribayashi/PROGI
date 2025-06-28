package exemplos_202506;

public class Exemplo52 {

    public static double[] criarArray() {
        double[] vetor = {7, 4, 9, 10};
        return vetor;
    }

    public static double[] elevarQuadrado(double[] meuArray) {
        double[] novoArray = new double[meuArray.length];
        for (int i=0; i<meuArray.length; i++) {
            novoArray[i] = meuArray[i] * meuArray[i];
        }
        return novoArray;
    }

    public static void imprimirArray(double[] vetor) {
        for (int i=0; i<vetor.length; i++)
            System.out.print(vetor[i] + " ");
    }

    public static void main(String[] args) {
        double[] meuVetor = criarArray();
        double[] novoVetor = elevarQuadrado(meuVetor);
        imprimirArray(meuVetor);
        System.out.println();
        imprimirArray(novoVetor);
    }
}