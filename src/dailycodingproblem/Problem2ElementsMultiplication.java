package dailycodingproblem;

import java.util.Arrays;

/**
 * Statement:
 * Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Source:  Daily Coding Problem https://www.dailycodingproblem.com/
 */
public class Problem2ElementsMultiplication {
    static int[] input_one = {1, 2, 3, 4, 5};
    static int[] input_two = {3, 2, 1};
    int[] emptyArray = {};

    public static void main(String[] args) {
        Problem2ElementsMultiplication problem2 = new Problem2ElementsMultiplication();

        System.out.println(String.format("With array %s the result is: ", Arrays.toString(input_one)));
        System.out.println(Arrays.toString(problem2.productOfElements(input_one)));

        System.out.println(String.format("With array %s the result is: ", Arrays.toString(input_two)));
        System.out.println(Arrays.toString(problem2.productOfElements(input_two)));

    }

    /**
     * Without the division operator and with O(n) time complexity:
     * Approach: for each element, the product of all its left side values
     * times all its right side values should give the product of all elements except the current element.
     */
     int[] productOfElements(int[] initial) {
        if(initial == null || initial.length==0) {
            return emptyArray;
        }

        var result = new int[initial.length];
        var left = new int[initial.length];
        var right = new int[initial.length];

        // Left side: find the product of the left side of each current element
        left[0] = 1;

        for(int i = 0; i<initial.length-1; i++) {
            left[i+1] = left[i]*initial[i];
        }

         // Right side: find the product of the right side of each current element
         right[initial.length-1] = 1;

         for(int i = initial.length-1; i>0; i--) {
             right[i-1] = right[i]*initial[i];
         }

         // Find the result
         for (int i=0; i < initial.length; i++) {
             result[i] = left[i]*right[i];
         }

        return result;
    }

    /**
     * Using division operator
     */
    int[] productOfElementsUsingDivisionOperator(int[] initial) {
        if(initial == null || initial.length==0) {
            return emptyArray;
        }
        var result = new int[initial.length];
        var productOfAllElements = Arrays.stream(initial).reduce(1, (a, b) -> a*b);

        for(int i=0; i< result.length; i++) {
            result[i] = productOfAllElements/initial[i];
        }

        return result;
    }
}
