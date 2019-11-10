package arrays.fetching;

import shared.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all pairs of an integer array whose sum is equal to a given number
 */
public class FindIntPairsWithSumEqualToN {
    public static void main(String[] args) {
        int[] arr = {1,7,6,2,4,4};

        printToScreenResult(findTargetNumbers(arr, 8));
    }

    private static List<Pair<Integer>> findTargetNumbers(int[] arr, int number) {
        List<Pair<Integer>> pairs = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == number) {
                    pairs.add(new Pair<>(arr[i], arr[j]));
                }
            }
        }

        return pairs;
    }

    private static void printToScreenResult(List<Pair<Integer>> result) {
        result.forEach(integerPair -> System.out.printf("%d and %d%n", integerPair.getX(), integerPair.getY()));
    }
}
