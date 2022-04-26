package ordenacao;

public class SelectionSort extends MetodoOrdenacao {

    public SelectionSort(int[] numeros) {
        super(numeros);
    }

    @Override
    public void sort() {

        int eleito, menor, pos;

        for (int i = 0; i < vet.length - 1; i++) {
            eleito = vet[i];
            menor = vet[i + 1];
            pos = i + 1;
            for (int j = i + 2; j < vet.length; j++) {
                if (vet[j] < menor) {
                    menor = vet[j];
                    pos = j;
                }
            }
            if (menor < eleito) {
                vet[i] = vet[pos];
                vet[pos] = eleito;
            }
        }
    }
}
