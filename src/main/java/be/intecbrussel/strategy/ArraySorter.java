package be.intecbrussel.strategy;

public class ArraySorter {
    //properties
    private ArraySortingAlgorithm arraySortingAlgorithm;


    //constructors
    public ArraySorter(ArraySortingAlgorithm arraySortingAlgorithm) {
        this.arraySortingAlgorithm = arraySortingAlgorithm;
    }


    //setters
    public void setArraySortingAlgorithm(ArraySortingAlgorithm arraySortingAlgorithm) {
        this.arraySortingAlgorithm = arraySortingAlgorithm;
    }

    
    //custom methods
    public int[] sortArray(int[] array) {
        return arraySortingAlgorithm.sortArray(array);
    }

}
