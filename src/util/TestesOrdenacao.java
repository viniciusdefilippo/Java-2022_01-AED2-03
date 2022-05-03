package util;

import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.SelectionSort;


public class TestesOrdenacao {
    public static void main(String[] args) {

        int QTDE_NUMEROS = 10;
        int NUM_DIGITOS = 2;

        Util util = new Util();
        int[] numeros = util.gerarVetorNumerosAleatorios(QTDE_NUMEROS, NUM_DIGITOS);


        int[] numeros_bubble = util.copia(numeros);
        BubbleSort bubble = new BubbleSort(numeros_bubble);
        bubble.sort();
        util.printVetorNumeros(numeros);
        bubble.print();

        int[] numeros_insertion = util.copia(numeros);
        InsertionSort insertion = new InsertionSort(numeros_insertion);
        insertion.sort();
        util.printVetorNumeros(numeros);
        insertion.print();

        int[] numeros_selection = util.copia(numeros);
        SelectionSort selection = new SelectionSort(numeros_selection);
        selection.sort();
        util.printVetorNumeros(numeros);
        selection.print();

        int[] numeros_quicksort = util.copia(numeros);
        SelectionSort quicksort = new SelectionSort(numeros_quicksort);
        quicksort.sort();
        util.printVetorNumeros(numeros);
        quicksort.print();

        int[] numeros_mergesort = util.copia(numeros);
        SelectionSort mergesort = new SelectionSort(numeros_mergesort);
        mergesort.sort();
        util.printVetorNumeros(numeros);
        mergesort.print();

//        int numRepeticoes = 30;
//        double soma;
//
//
//        soma = 0;
//        int[] numeros_selection = util.copia(numeros);
//
//        for (int i = 0; i < numRepeticoes; i++) {
//            long startTime = System.nanoTime();
//            SelectionSort selection = new SelectionSort(numeros_selection);
//            selection.sort();
//            long totalTime = System.nanoTime() - startTime;
//            //System.out.println(totalTime);
//            soma += totalTime;
//            //double elapsedTimeInSecond = (double) totalTime / 1_000_000_000;
//        }
//        System.out.printf("SelectionSort: Média tempo execução = %.0f\n",
//                soma / numRepeticoes);
//        //util.printVetorNumeros(numeros);
//
//
//        soma = 0;
//        int[] numeros_insertion = util.copia(numeros);
//
//        for (int i = 0; i < numRepeticoes; i++) {
//            long startTime = System.nanoTime();
//            InsertionSort insertion = new InsertionSort(numeros_insertion);
//            insertion.sort();
//            long totalTime = System.nanoTime() - startTime;
//            //System.out.println(totalTime);
//            soma += totalTime;
//            //double elapsedTimeInSecond = (double) totalTime / 1_000_000_000;
//        }
//        System.out.printf("InsertionSort: Média tempo execução = %.0f\n",
//                soma / numRepeticoes);
//        //util.printVetorNumeros(numeros);
//
//
//
//        soma = 0;
//        int[] numeros_bubble = util.copia(numeros);
//
//        for (int i = 0; i < numRepeticoes; i++) {
//            long startTime = System.nanoTime();
//            BubbleSort bubble = new BubbleSort(numeros_bubble);
//            bubble.sort();
//            long totalTime = System.nanoTime() - startTime;
//            //System.out.println(totalTime);
//            soma += totalTime;
//            //double elapsedTimeInSecond = (double) totalTime / 1_000_000_000;
//        }
//        System.out.printf("BubbleSort: Média tempo execução = %.0f\n",
//                soma / numRepeticoes);
//        //util.printVetorNumeros(numeros);

    }
}
