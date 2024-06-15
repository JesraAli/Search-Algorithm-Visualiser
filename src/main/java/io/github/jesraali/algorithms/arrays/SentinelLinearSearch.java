package io.github.jesraali.algorithms.arrays;

/** A type of Linear Search, number of comparisons reduced.
 * Linear Search: N comparisons made
 * Sentinel Linear Search: a sentinal value used to avoid out of bound comparisons.
 * ^^ No additional comparison made specifically for index of element being searched
 *
 * Sets last element of array to "sentinal" value, which is the same value as the target value.
 * ^^ avoids checking array boundary condition
 * ^^ if we reach the 'sentinal value', then we stop.
 *
 * Then linear search performed on the array. Does not check whether current index is inside index range.
 * So index to be checked will never be out of bounds of array
 *
 * Number of comparisons in worst case: (N+2)
 * Worst case time complexity: O(n)*/

public class SentinelLinearSearch {

    int[] array;
    int searchValue;

    public SentinelLinearSearch(int[] array, int searchValue){
        this.array = array;
        this.searchValue = searchValue;
    }

    public int run() {
        int i = 0;
        int lastValue = array[array.length - 1];
        array[array.length-1] = searchValue; // Set last value to sentinel value

        // Does 1 comparison each iteration, only checks if array[i] is equal to search value
        while(array[i] != searchValue){
            i++;
        }

        //Exits the loop if we've reached the search value OR the end value
        array[array.length-1] = lastValue; // Replace sentinel value with original last value

        if(array[i] == searchValue){ // Check if i is the searchValue
            return i;
        }
        else{
            return -1;
        }

    }
}
