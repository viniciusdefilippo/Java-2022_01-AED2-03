package ordenacao;

public class BubbleSort extends MetodoOrdenacao {

    public BubbleSort(int[] numeros) {
        super(numeros);
    }

    @Override
    public void sort() {
        for (int i = 0; i < vet.length; i++) {
            for (int j = vet.length - 1; j > i; j--) {
                if (vet[j] < vet[j - 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }
            }
        }
    }
}
