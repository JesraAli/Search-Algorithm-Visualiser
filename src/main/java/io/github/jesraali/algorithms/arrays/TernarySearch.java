package io.github.jesraali.algorithms.arrays;

import java.util.Arrays;

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

//        System.out.println(Arrays.toString(array));

        // Initialise left pointer to first INDEX
        // Initialise right pointer to last INDEX
        int left = 0;
        int right = array.length-1; // Last element is array length -1

        while(left <= right) {
            // create two splits, so we have [0,split1] [split1, split2] [split2, end of array
            int split1 = left + ((right - left) / 3); // calculate (right-left)/3 to get the split. then add this to start of array value
            int split2 = right - ((right - left) / 3);// same thing, calculate (right-left)/3. Then SUBTRACT this from the END of array value

//            System.out.println(split1);
//            System.out.println(split2);

            // Check if value is the value at split1 or split2
            if (array[split1] == searchValue) {
                return split1; // return index of the search target
            } else if (array[split2] == searchValue) {
                return split2;
            }

            // If search value greater than value at index split2, return array [split2, end of array]
            else if (searchValue > array[split2]) {

                left = split2 + 1;

            }

            // If search value less than number at split1, return array [0,split1]
            else if (searchValue < array[split1]) {

                right = split1 - 1;
            }

            // If search value is BETWEEN split 1 and split 2, return array [split1, split2]
            else if (searchValue > array[split1] && searchValue < array[split2]) {
                left = split1 + 1;
                right = split2 -1;
            }
        }

        return 1000;
    }


//    public int run(int[] array, int searchValue) {
//
//        System.out.println(Arrays.toString(array));
//
//        // Initialise left pointer to first INDEX
//        // Initialise right pointer to last INDEX
//        int left = 0;
//        int right = array.length-1; // Last element is array length -1
//
//        // create two splits, so we have [0,split1] [split1, split2] [split2, end of array
//        int split1 = left + ((right - left) / 3); // calculate (right-left)/3 to get the split. then add this to start of array value
//        int split2 = right - ((right - left) / 3);// same thing, calculate (right-left)/3. Then SUBTRACT this from the END of array value
//
//        System.out.println(split1);
//        System.out.println(split2);
//
//        // Check if value is the value at split1 or split2
//        if(array[split1] == searchValue){
//            return split1; // return index of the search target
//        }
//        else if(array[split2] == searchValue){
//            return split2;
//        }
//
//        // If search value greater than value at index split2, return array [split2, end of array]
//        else if(searchValue > array[split2]) {
//
//
//            int[] tempArray = new int[array.length-split2-1];
//            int test = array.length - split2-1;
//            System.out.println("array length - split2:" + test);
//            System.arraycopy(array,split2+1,tempArray,0,test);
//            return run(tempArray,searchValue);
//
//        }
//
//        // If search value less than number at split1, return array [0,split1]
//        else if(searchValue < array[split1]) {
//            int[] tempArray = new int[split1+1];
//
//            // Copy original array from starting position 0 in both tempArray and original array, and copy until split1
//            System.arraycopy(array,0,tempArray,0,split1-1);
//            return run(tempArray, searchValue);
//        }
//
//        // If search value is BETWEEN split 1 and split 2, return array [split1, split2]
//        else if(searchValue > array[split1] && searchValue < array[split2]) {
//            int[] tempArray = new int[split2-split1 +1];
//
//            // Start from split1, copy into index 0 in the temporary array. Continue until reach split2
//            System.arraycopy(array,split1,tempArray,0,split2-split1+1);
//            return run(tempArray, searchValue);
//        }
//
//        return 1000;
//    }
}
