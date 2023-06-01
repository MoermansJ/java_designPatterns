package be.intecbrussel.strategy;

public class BubbleSortAlgorithm implements ArraySortingAlgorithm {
    @Override
    public int[] sortArray(int[] arr) {
        //copy pasta   https://www.javatpoint.com/bubble-sort-in-java
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
