package com.github.curriculeon;

public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of integers between `start` and `stop` incrementing by 1
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] returnArray = new Integer[end - start + 1];

        for ( int i = 0 ; i < returnArray.length ; i++ ){ // For loop or whatever
            returnArray[i] = i; // Population of the array
        }

        return returnArray;
    }
}
