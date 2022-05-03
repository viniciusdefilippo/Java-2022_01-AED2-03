package ordenacao;

public class MergeSort extends MetodoOrdenacao {

    public MergeSort(int[] numeros) {
        super(numeros);
    }

    @Override
    public void sort() {
        merge(vet, 0, vet.length - 1);
    }

    private void merge(int[] X, int inicio, int fim) {

        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(X, inicio, meio);
            merge(X, meio + 1, fim);
            intercala(X, inicio, fim, meio);
        }
    }

    private void intercala(int[] X, int inicio, int fim, int meio) {

        int poslivre, inicio_vetor1, inicio_vetor2, i;
        int[] aux = new int[X.length];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            if (X[inicio_vetor1] <= X[inicio_vetor2]) {
                aux[poslivre] = X[inicio_vetor1];
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
                aux[poslivre] = X[inicio_vetor2];
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre++;
        }

        for (i = inicio_vetor1; i <= meio; i++) {
            aux[poslivre] = X[i];
            poslivre++;
        }
        for (i = inicio_vetor2; i <= fim; i++) {
            aux[poslivre] = X[i];
            poslivre++;
        }
        for (i = inicio; i <= fim; i++) {
            X[i] = aux[i];
        }
    }
}
