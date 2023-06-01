package be.intecbrussel.strategy;

import java.util.Arrays;

public class StrategyMain {
    public static void main(String[] args) {
        //creating instances
        ArraySortingAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        ArraySortingAlgorithm mergeSortAlgorithm = new MergeSortAlgorithm();
        ArraySorter arraySorter = new ArraySorter(bubbleSortAlgorithm);
        int[] intArray1 = new int[]{1, 3, 2, 4, -2, 6, 5, 9, 8, 7, 0, -1};
        int[] intArray2 = new int[]{-1, 4, 3, 2, -2, 5, 6, 7, 8, 9, 0, 1};
        int[] intArray3 = new int[]{1, 3, 8, -5, -27, 3, 5, 1000, -1000};


        //sorting using bubbleSortAlgorithm
        System.out.println("intArray1: " + Arrays.toString(arraySorter.sortArray(intArray1)) + " sorted using bubbleSortAlgorithm");


        //swapping sorting algorithms
        arraySorter.setArraySortingAlgorithm(mergeSortAlgorithm);


        //sorting using mergeSortAlgorithm
        System.out.println("intArray2: " + Arrays.toString(arraySorter.sortArray(intArray2)) + " sorted using mergeSortAlgorithm");
        System.out.println("intArray3: " + Arrays.toString(arraySorter.sortArray(intArray3)) + " sorted using mergeSortAlgorithm");

    }
}
