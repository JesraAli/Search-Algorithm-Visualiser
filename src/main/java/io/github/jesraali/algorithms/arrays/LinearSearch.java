package io.github.jesraali.algorithms.arrays;

public class LinearSearch {

    int[] array;
    int searchValue;

    public LinearSearch(int[] array, int searchValue){
        this.array = array;
        this.searchValue = searchValue;
    }

    public int run() {
        //Does two comparisons, checks if i < array length AND if array[i] is a search value
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
