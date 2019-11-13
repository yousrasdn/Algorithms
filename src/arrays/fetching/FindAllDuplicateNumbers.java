package arrays.fetching;

import java.sql.Time;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;

/**
 *  Find all duplicate numbers in an array
 *  Input: an array containing multiple duplicates
 */
public class FindAllDuplicateNumbers {
    public static void main(String[] args) {
        findAllDuplicates(new Integer[]{4,2,12,3,5,2,0,4,12,8,0,26,2});
    }

    private static void findAllDuplicates(Integer[] arr) {
        System.out.printf("Finding all duplicates in %s%n", Arrays.toString(arr));
        long startTime = System.currentTimeMillis();

        Set<Integer> duplicates = new HashSet<>();

        Arrays.sort(arr);

        for (int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                duplicates.add(arr[i]);
            }
        }

        long finishTime = System.currentTimeMillis();

        System.out.printf("Duplicates found: %s%n", duplicates.toString());
        System.out.printf("Time taken to run the algorithm: %d%n", (finishTime-startTime));
    }
}
