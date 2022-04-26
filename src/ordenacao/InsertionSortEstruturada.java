package ordenacao;

import java.util.Scanner;

public class InsertionSortEstruturada {
    public static void main(String[] args) {

        int vet[] = new int[5];
        int i, j, eleito;

        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vet[i] = entrada.nextInt();
        }

        for (i = 1; i <= 4; i++) {
            eleito = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > eleito) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = eleito;
        }

        for (i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º numero: " + vet[i]);
        }

    }
}
