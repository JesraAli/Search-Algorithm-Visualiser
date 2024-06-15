package io.github.jesraali.algorithms.arrays;

public class LinearSearch {

    int[] array;
    int searchValue;

    public LinearSearch(int[] array, int searchValue){
        this.array = array;
        this.searchValue = searchValue;
    }

    public int run() {
        for (int i = 0; i != searchValue; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
