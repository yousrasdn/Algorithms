package arrays.fetching;

import java.util.Arrays;
import java.util.BitSet;


/**
 * Date: 5/21/2019
 * Reference: https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
 * Find the missing number in a given integer array of 1 to 10?
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {4,1,5,2,7,6,9,8,10};
        int[] numbersWithThreeMissingNumbers = {2,1,4,6,10,9,8};

        System.out.println("Using method 1: " + findMissingNumber(numbers,1));
        System.out.println("Using method 2: " + findMissingNumberUsingSumFormula(numbers, numbers.length+1));
        findAllMissingNumbers(numbersWithThreeMissingNumbers, 10);
    }

    // Assuming the array has no duplicates
    // min is the smallest number within the array
    private static int findMissingNumber(int[] numbers, int min) {
        Arrays.sort(numbers);
        int tracker = min;

        for (int i=0; i<numbers.length; i++) {
            if(tracker == numbers[i]) {
                tracker++;
            } else {
                return tracker;
            }
        }
        return -1;
    }

    // Mwthod 2 - Using Sum Formula (sum of numbers from 1 to n = n*(n+1)/2)
    // Given that the missing number can be calculated as follows:
    // missing number = (sum of all numbers from 1 to n) - (sum of all numbers in the array)
    private static int findMissingNumberUsingSumFormula(int[] numbers, int expectedTotalCountOfNumbers) {
        Arrays.sort(numbers);
        int totalSum =  (expectedTotalCountOfNumbers * (expectedTotalCountOfNumbers + 1)) /2;
        int totalSumOfNumInArray = 0;

        for(int num:numbers) {
            totalSumOfNumInArray += num;
        }
        return totalSum - totalSumOfNumInArray;
    }

    // In contrast to the first and second methods, the following will find all missing numbers within an array
    /**
     * Find all missing numbers within an array
     * @param numbers the input array with missing numbers
     * @param expectedLength the expected length of the array (if the missing numbers were present)
     */
    private static void findAllMissingNumbers(int[] numbers, int expectedLength) {
        Arrays.sort(numbers);
        int numberOfMissingNumbers = expectedLength - numbers.length;
        BitSet bitSet = new BitSet(expectedLength);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.println("Finding All Missing Numbers: ");
        int lastMissingIndex = 0;
        for (int i=0; i< numberOfMissingNumbers; i++) {
           lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.print(++lastMissingIndex + " ");
        }
    }
}
