package io.github.jesraali.algorithms.arrays;

/** Array must be already sorted
 * checks fewer elements by jumping ahead a fixed amount of steps
 * have a block size m, we continue jumping in this interval until we hit an index element value
 * that is greater than the search value
 * We then perform a LINEAR search from the jump index element that was not greater than the search value
 *
 * Is BETTER than linear search. Worse than binary search
 *
 * -> Best step size is root(n) - where n is the length of the array
 * */
public class JumpSearch {

    int[] array;
    int searchValue;

    public JumpSearch(int[] array, int searchValue){
        this.array = array;
        this.searchValue = searchValue;
    }

    public int run() {

        int arrayLength = array.length;
        double jumpSize = Math.floor(Math.sqrt(arrayLength)); //Floor the square root value so it's not a long number
        int i = 0;
        while(array[i]< searchValue){
            i+= (int) jumpSize;
        }
        i -= (int) jumpSize; // Revert it back to i value that is not > search value

        for (int j = i; j < array.length; j++) {
            if (array[j] == searchValue) {
                return j;
            }
        }
        return -1;
    }
}
