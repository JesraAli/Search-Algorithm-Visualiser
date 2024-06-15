package io.github.jesraali;

import io.github.jesraali.algorithms.arrays.BinarySearch;
import io.github.jesraali.algorithms.arrays.LinearSearch;
import io.github.jesraali.algorithms.arrays.SentinelLinearSearch;
import io.github.jesraali.algorithms.arrays.TernarySearch;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 8, 2, 4, 6};
        int[] sortedArray = {1, 2, 2, 4, 5, 6, 8};

        int searchValue = 1;
//
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.run(sortedArray,searchValue));

//        LinearSearch linearSearch = new LinearSearch(array,searchValue);
//        System.out.println(linearSearch.run());
//
//        SentinelLinearSearch sentinelLinearSearch = new SentinelLinearSearch(array,searchValue);
//        System.out.println(sentinelLinearSearch.run());

        TernarySearch ternarySearch = new TernarySearch();
        System.out.println(ternarySearch.run(sortedArray,searchValue));
    }
}