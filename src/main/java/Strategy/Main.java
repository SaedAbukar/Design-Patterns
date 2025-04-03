package Strategy;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }
        return array;
    }

    public static void main(String[] args) {
        int size1 = 30000;
        int size2 = 100000;
        int[] originalArr1 = generateRandomArray(size1);
        int[] originalArr2 = generateRandomArray(size2);

        Algorithm sorter = new Algorithm();


        // Sorting for size1 = 30000
        int[] arr1Merge = Arrays.copyOf(originalArr1, originalArr1.length);
        sorter.setSorter(new MergeSort(arr1Merge, 0, arr1Merge.length - 1));
        long startTime = System.currentTimeMillis();
        sorter.sort();
        long endTime = System.currentTimeMillis();
        System.out.println("Merge sort took for " + size1 + " ints: " + (endTime - startTime) + " ms");

        int[] arr1Insertion = Arrays.copyOf(originalArr1, originalArr1.length);
        sorter.setSorter(new InsertionSort(arr1Insertion));
        startTime = System.currentTimeMillis();
        sorter.sort();
        endTime = System.currentTimeMillis();
        System.out.println("Insertion sort took for " + size1 + " ints: " + (endTime - startTime) + " ms");

        int[] arr1Selection = Arrays.copyOf(originalArr1, originalArr1.length);
        sorter.setSorter(new SelectionSort(arr1Selection));
        startTime = System.currentTimeMillis();
        sorter.sort();
        endTime = System.currentTimeMillis();
        System.out.println("Selection sort took for " + size1 + " ints: " + (endTime - startTime) + " ms");

        // Sorting for size2 = 100000
        int[] arr2Merge = Arrays.copyOf(originalArr2, originalArr2.length);
        sorter.setSorter(new MergeSort(arr2Merge, 0, arr2Merge.length - 1));
        startTime = System.currentTimeMillis();
        sorter.sort();
        endTime = System.currentTimeMillis();
        System.out.println("Merge sort took for " + size2 + " ints: " + (endTime - startTime) + " ms");

        int[] arr2Insertion = Arrays.copyOf(originalArr2, originalArr2.length);
        sorter.setSorter(new InsertionSort(arr2Insertion));
        startTime = System.currentTimeMillis();
        sorter.sort();
        endTime = System.currentTimeMillis();
        System.out.println("Insertion sort took for " + size2 + " ints: " + (endTime - startTime) + " ms");

        int[] arr2Selection = Arrays.copyOf(originalArr2, originalArr2.length);
        sorter.setSorter(new SelectionSort(arr2Selection));
        startTime = System.currentTimeMillis();
        sorter.sort();
        endTime = System.currentTimeMillis();
        System.out.println("Selection sort took for " + size2 + " ints: " + (endTime - startTime) + " ms");
    }
}
