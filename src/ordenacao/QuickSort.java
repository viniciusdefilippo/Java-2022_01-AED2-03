package ordenacao;

public class QuickSort extends MetodoOrdenacao {

    public QuickSort(int[] numeros) {
        super(numeros);
    }

    @Override
    public void sort() {
        quicksort(vet, 0, vet.length - 1);
    }

    private static void troca(int[] X, int i, int j) {
        int aux;
        aux = X[i];
        X[i] = X[j];
        X[j] = aux;
    }

    private int particao(int[] X, int p, int r) {
        int pivo, i, j;
        pivo = X[(p + r) / 2];
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do j--;
            while (X[j] > pivo);
            do i++;
            while (X[i] < pivo);
            if (i < j) troca(X, i, j);
        }
        return j;
    }

    private void quicksort(int[] X, int p, int r) {
        int q;
        if (p < r) {
            q = particao(X, p, r);
            quicksort(X, p, q);
            quicksort(X, q + 1, r);
        }
    }
}
