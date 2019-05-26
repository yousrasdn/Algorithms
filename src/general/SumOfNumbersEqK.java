package general;

import java.util.HashSet;
import java.util.Set;

/**
 * Statement:
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 *
 * Source:  Daily Coding Problem https://www.dailycodingproblem.com/
 */
public class SumOfNumbersEqK {
    static int[] ar = {10, 15, 3, 7};
    static int k = 17;

    public static void main(String[] args) {

        numbersAddUpTok(ar, k);
        System.out.println();
        numbersAddUpTokUsingdoubleLoop(ar, k);
    }

    /**
     * Using complement of the current number: The following assumes that
     */
    private static void numbersAddUpTok(int[] ar, int k) {
        System.out.println("Using complement");
        if(ar == null || ar.length == 1) {
            System.out.println("Nothing found.");
            return;
        }

        Set<Integer> complemets = new HashSet<>();

        for(int i=0; i < ar.length; i++) {
            if(complemets.contains(k-ar[i])) {
                System.out.println("Numbers " + ar[i] + " and " + (k-ar[i]) + " add up to k = " + k);
            } else {
              complemets.add(ar[i]);
            }
        }
    }

    /**
     * Using double loop:
     */
    private static void numbersAddUpTokUsingdoubleLoop(int[] ar, int k) {
        System.out.println("Using double loops");
        if(ar == null || ar.length == 1) {
            System.out.println("Nothing found.");
            return;
        }
        for(int i=0; i<ar.length-1; i++) {
            for (int j=i+1; j<ar.length; j++) {
                if(ar[i]+ar[j]==k) {
                    System.out.println("The numbers " + ar[i] + " and " + ar[j] + " add up to k = " + k);
                }
            }
        }
    }
}
