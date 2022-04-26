package ordenacao;

import java.util.Scanner;

public class QuickSortEstruturada {
    public static void main(String[] args) {

        int vet[] = new int[10];
        int i;

        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vet[i] = entrada.nextInt();
        }

        quicksort(vet, 0, vet.length - 1);

        for (i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º numero: " + vet[i]);
        }
    }

    public static void troca(int X[], int i, int j) {
        int aux;
        aux = X[i];
        X[i] = X[j];
        X[j] = aux;
    }

    public static int particao(int X[], int p, int r) {
        int pivo, i, j;
        pivo = X[(p + r) / 2];
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do {
                j--;
            } while (X[j] > pivo);
            do {
                i++;
            } while (X[i] < pivo);
            if (i < j) troca(X, i, j);
        }
        return j;
    }

    public static void quicksort(int X[], int p, int r) {
        int q;
        if (p < r) {
            q = particao(X, p, r);
            quicksort(X, p, q);
            quicksort(X, q + 1, r);
        }

    }
}
