package io.github.jesraali.algorithms.arrays;

public class BinarySearch {


    public int run(int[] array, int searchValue) {

        // Input Array MUST be sorted for Binary Search.

        // Always working on the same array, whether that's iteratively or recursively -This is so we can retrieve the indexes in the array.
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
}
