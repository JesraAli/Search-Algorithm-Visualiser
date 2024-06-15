package io.github.jesraali.algorithms.arrays;

public class BinarySearch {


//    int[] array;
//    int searchValue;

//    public BinarySearch(int[] array, int searchValue){
//        this.array = array;
//        this.searchValue = searchValue;
//    }

    public int run(int[] array, int searchValue) {

        int midpoint = array.length / 2;
        if(array[midpoint] == searchValue) {
            return midpoint;
        }
        else if(array[midpoint] < searchValue) {
            int[] tempArray = new int[midpoint+1];

            // Copy original array from starting position midpoint in  tempArray and 0 in original array, and copy until length of original array
            System.arraycopy(array,midpoint,tempArray,0,array.length);
            return run(tempArray, searchValue);
        }
        else if(array[midpoint] > searchValue) {
            int[] tempArray = new int[midpoint+1]; // Create temporary array of length midpoint+1

            // Copy original array from starting position 0 in both tempArray and original array, and copy until midpoint
            System.arraycopy(array,0,tempArray,0,midpoint);
            return run(tempArray, searchValue);
        }

        return -1;
    }

}
