package ordenacao;

public abstract class MetodoOrdenacao {

    protected int vet[];

    public MetodoOrdenacao(int[] numeros) {
        this.vet = numeros;
    }

    public void print() {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public void sort() {}
}
