package util;

import java.util.*;

public class GerarNumAleatorios {
    public static void main(String[] args) {

        int QTDE_NUMEROS = 5;
        int NUM_DIGITOS = 2;
        int[] numeros = gerarVetorNumerosAleatorios(QTDE_NUMEROS, NUM_DIGITOS);
        printVetorNumeros(numeros);

    }

    public static void printVetorNumeros(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public static int[] gerarVetorNumerosAleatorios(int QTDE_NUMEROS, int NUM_DIGITOS) {
        int[] vet = new int[QTDE_NUMEROS];
        int cont = 0;
        while (cont < QTDE_NUMEROS) {
            int n = generateRandomDigits(NUM_DIGITOS);
            if (!contains(n, vet)) {
                vet[cont] = n;
                cont++;
            }
        }
        return vet;
    }

    public static boolean contains(int n, int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == n) return true;
        }
        return false;
    }

    // Gera um numero aleatorio positivo com n digitos
    public static int generateRandomDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        // a soma inicial de m é para garantir que os números sempre
        // tenham n dígitos e não ocorrerem números como 0, 10, etc
        return m + new Random().nextInt(9 * m);
    }
}
