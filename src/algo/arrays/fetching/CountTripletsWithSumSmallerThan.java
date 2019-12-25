package algo.arrays.fetching;

import java.util.Arrays;

/**
 * Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value.
 * Expected Time Complexity is O(n2).
 *
 * Source: https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
 *
 * Examples:
 *
 * Input : arr[] = {-2, 0, 1, 3}
 *         sum = 2.
 * Output : 2
 * Explanation :  Below are triplets with sum less than 2
 *                (-2, 0, 1) and (-2, 0, 3)
 *
 * Input : arr[] = {5, 1, 3, 4, 7}
 *         sum = 12.
 * Output : 4
 * Explanation :  Below are triplets with sum less than 12
 *                (1, 3, 4), (1, 3, 5), (1, 3, 7) and
 *                (1, 4, 5)
 */
public class CountTripletsWithSumSmallerThan {

    public static void main(String[] args) {
        System.out.println(countNumberOfTripletsWithSumSmallerThan(new int[]{1,3,5,0,7,2}, 4));
        System.out.println(countNumberOfTripletsWithSumSmallerThan(new int[]{1,3,5,0,7,6,2,8,10}, 8));

    }

    private static int countNumberOfTripletsWithSumSmallerThan(int[] arr, int sum) {
        Arrays.sort(arr);
        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int j = i+1, k = arr.length-1;

            while (j < k) {
                int currentSum = arr[i] + arr[j] + arr[j];

                if (currentSum >= sum) {
                    k--;
                } else {
                    counter += (k-j);
                    j++;
                }
            }

        }

        return counter;
    }
}
