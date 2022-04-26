package ordenacao;

public class InsertionSort extends MetodoOrdenacao {

    public InsertionSort(int[] numeros) {
        super(numeros);
    }

    public void sort() {
        int j, eleito;
        for (int i = 1; i < vet.length; i++) {
            eleito = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > eleito) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
        }
    }

    public void print() {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
}
