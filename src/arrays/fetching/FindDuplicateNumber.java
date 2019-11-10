package arrays.fetching;

import java.util.Arrays;

/**
 * Date: 5/22/2019
 * Problem statement: find the duplicate number on a given integer array
 * Source: https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
 */
public class FindDuplicateNumber {
    private static final int[] NUMBERS1 = {4,1,2,8,3,4,7};
    private static final int[] NUMBERS2 = {4,1,2,8,10,3,9,7};

    public static void main(String[] args) {
        System.out.println("Using Method 1");
        findDuplicateNumberMethod1(NUMBERS1);
        findDuplicateNumberMethod1(NUMBERS2);

        System.out.println();

        System.out.println("Using Method 2");
        findDuplicateNumberMethod2(NUMBERS1);
        findDuplicateNumberMethod2(NUMBERS2);
    }

    // Assuming there is at most one duplicate number
    /**
     * Method 1 - Time complexity: O(n^2)
     * @param ar input values
     * @return the duplicated number if exists, -1 otherwise
     */
    private static void findDuplicateNumberMethod1(int[] ar) {
        var duplicatedNumber = -1;

        for(int i=0; i < ar.length-1; i++) {
            for(int j=i+1; j<ar.length; j++) {
                if(ar[i] == ar[j]) {
                    duplicatedNumber = ar[i];
                    break;
                }
            }
            if(duplicatedNumber != -1)
                break;
        }

        if(duplicatedNumber == -1) {
            System.out.println("No duplicated number found");
        } else {
            System.out.println(String.format("The duplicated number is %d", duplicatedNumber));
        }
    }

    /**
     * Method 2
     * @param ar input values
     * @return the duplicated number if exists, -1 otherwise
     */
    private static void findDuplicateNumberMethod2(int[] ar) {
        var duplicatedNumber = -1;

        Arrays.sort(ar);

        for(int i=0; i< ar.length-1; i++) {
            if(ar[i]==ar[i+1]) {
                duplicatedNumber = ar[i];
                break;
            }
        }

        if(duplicatedNumber == -1) {
            System.out.println("No duplicated number found");
        } else {
            System.out.println(String.format("The duplicated number is %d", duplicatedNumber));
        }
    }
}
