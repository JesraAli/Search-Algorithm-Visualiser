package io.github.jesraali.algorithms.arrays;

import java.util.Arrays;


public class BinarySearch {


    public int run(int[] array, int searchValue) {

        // Input Array MUST be sorted for Binary Search.

        // Always working on the same array, whether thats iteratively or recursively -This is so we can retrieve the indexes in the array.
        // The only thing we change is the low and high pointers - allows us to change different parts of search space.
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == searchValue) {
                return mid;
            }
            if (array[mid] < searchValue) {
                low = mid + 1;
            }
            if (array[mid] > searchValue) {
                high = mid - 1;
            }
        }
        return -1;
    }
//    int[] array;
//    int searchValue;

//    public BinarySearch(int[] array, int searchValue){
//        this.array = array;
//        this.searchValue = searchValue;
//    }

//    public int run(int[] array, int searchValue) {
//
//        // Input Array MUST be sorted for Binary Search.
//        int low = 0;
//        int high = array.length - 1;
//
//        return binarySearch(array,searchValue, low, high);
//    }
//
//    public int binarySearch(int[] array, int searchValue, int low, int high){
//        System.out.println("high:"+ high +" low:"+ low);
//        System.out.println(Arrays.toString(array));
//        int midpoint = (high-low)/2;
//        System.out.println("midpoint:"+ midpoint);
//        if(array[midpoint] == searchValue) {
//            return midpoint;
//        }
//        else if(array[midpoint] < searchValue) {
//            low = midpoint+1;
//
//            int[] tempArray = new int[midpoint+1];
//
//            // Copy original array from starting position midpoint in  tempArray and 0 in original array, Length of elements to be copied is array.length;
//            System.arraycopy(array,midpoint,tempArray,0,array.length-midpoint);
//            return binarySearch(tempArray, searchValue,low,high);
//        }
//        else if(array[midpoint] > searchValue) {
//            high = midpoint-1;
//
//            int[] tempArray = new int[midpoint+1]; // Create temporary array of length midpoint+1
//
//            // Copy original array from starting position 0 in both tempArray and original array. Length of elements to be copied is 'midpoint;
//            System.arraycopy(array,0,tempArray,0,midpoint);
//            return binarySearch(tempArray, searchValue,low,high);
//        }
//
//        return -1;
//    }

}
