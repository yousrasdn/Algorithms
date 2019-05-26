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

    int[] productOfElements(int[] initial) {
        if(initial == null || initial.length==1) {
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
