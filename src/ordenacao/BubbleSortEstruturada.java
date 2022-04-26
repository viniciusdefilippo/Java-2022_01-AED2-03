package ordenacao;

import java.util.Scanner;

public class BubbleSortEstruturada {

    public static void main(String[] args) {
        int vet[] = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vet[i] = entrada.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            for (int j = vet.length - 1; j > i; j--) {
                if (vet[j] < vet[j - 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º numero: " + vet[i]);
        }
    }

}
