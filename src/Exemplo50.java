public class Exemplo50 {

    public static void contagemNumeros(int[] vetor){
        int qtdNumerosPares = 0;
        int qtdNumerosImpares = 0;
        int qtdNumerosPrimos = 0;
        for (int i=0; i<vetor.length; i++){
            if ( Exemplo49.ehPar(vetor[i]) )
                qtdNumerosPares = qtdNumerosPares+1;
            else qtdNumerosImpares = qtdNumerosImpares + 1;

            if ( Exemplo49.ehPrimo(vetor[i]) )
                qtdNumerosPrimos = qtdNumerosPrimos + 1;
        }
        System.out.println("Qtd. Numeros Pares: "+qtdNumerosPares);
        System.out.println("Qtd. Numeros Impares: "+qtdNumerosImpares);
        System.out.println("Qtd. Numeros Primos: "+qtdNumerosPrimos);
    }

    public static void main(String[] args) {
        int[] meuVetor = Exemplo49.criarArray();
        contagemNumeros(meuVetor);
    }
}
