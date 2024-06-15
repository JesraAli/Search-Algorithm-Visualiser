package io.github.jesraali;

import io.github.jesraali.algorithms.arrays.BinarySearch;
import io.github.jesraali.algorithms.arrays.LinearSearch;
import io.github.jesraali.algorithms.arrays.SentinelLinearSearch;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 8, 2, 4, 6};
        int searchValue = 10;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.run(array,searchValue));

        LinearSearch linearSearch = new LinearSearch(array,searchValue);
        System.out.println(linearSearch.run());

        SentinelLinearSearch SentinelLinearSearch = new SentinelLinearSearch(array,searchValue);
        System.out.println(SentinelLinearSearch.run());
    }
}