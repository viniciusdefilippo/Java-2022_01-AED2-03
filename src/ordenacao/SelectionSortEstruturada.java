package ordenacao;

import java.util.Scanner;

public class SelectionSortEstruturada {

    public static void main(String[] args) {

        int vet[] = new int[5];
        int i, j, eleito, menor, pos;

        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vet[i] = entrada.nextInt();
        }

        for (i = 0; i <= 3; i++) {
            eleito = vet[i];
            menor = vet[i + 1];
            pos = i + 1;
            for (j = i + 2; j <= 4; j++) {
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
        for (i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º numero: " + vet[i]);
        }
    }
}
