package io.github.jesraali.algorithms.arrays;

/** Similar to Binary Search, but instead of dividing array into 2 parts, Ternary
 * divides array into 3 parts - data must be SORTED
 *
 * -> Narrows down search spaces, compares target value with elements at two points
 * ^^ reduces time complexity
 *
 * Good for:
 * large ordered arrays
 * finding maximum/minimum value
 * evaluating quadratic expression
 *
 *
 * Ternary Search makes 2 comparisons per iteration, whilst Binary Search makes 1 comparison
 * ^^ So binary search is more efficient
 * */
public class TernarySearch {


    public int run(int[] array, int searchValue) {


        // Initialise left pointer to first INDEX
        // Initialise right pointer to last INDEX

        int left = 0;
        int right = array.length-1; // Last element is array length -1

        while(left <= right) {
            // create two splits, so we have [0,split1] [split1, split2] [split2, end of array
            int split1 = left + ((right - left) / 3); // calculate (right-left)/3 to get the split. then add this to start of array value
            int split2 = right - ((right - left) / 3);// same thing, calculate (right-left)/3. Then SUBTRACT this from the END of array value


            // Check if value is the value at split1 or split2
            if (array[split1] == searchValue) {
                return split1; // return index of the search target
            } else if (array[split2] == searchValue) {
                return split2;
            }

            // If search value greater than value at index split2, change search space to [split2, end of array]
            else if (searchValue > array[split2]) {

                left = split2 + 1;

            }

            // If search value less than number at split1, change search space to [0,split1]
            else if (searchValue < array[split1]) {

                right = split1 - 1;
            }

            // If search value is BETWEEN split 1 and split 2, change search space to [split1, split2]
            else if (searchValue > array[split1] && searchValue < array[split2]) {
                left = split1 + 1;
                right = split2 -1;
            }
        }
        return -1;
    }
}
