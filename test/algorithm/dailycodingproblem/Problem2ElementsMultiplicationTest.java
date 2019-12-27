package algorithm.dailycodingproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
public class Problem2ElementsMultiplicationTest {
    private Problem2ElementsMultiplication instance = new Problem2ElementsMultiplication();

    @Test
    public void elementsMutiplication_InitialArrayNull_ResultIsEmpty() {
        // given
        int[] ar = null;

        // when
        int[] result = instance.productOfElements(ar);

        // then
        assertTrue(result.length == 0);
    }

    @Test
    public void elementsMutiplication_InitialArrayEmpty_ResultIsEmpty() {
        // given
        int[] ar = {};

        // when
        int[] result = instance.productOfElements(ar);

        // then
        assertTrue(result.length == 0);
    }

    @Test
    public void elementsMutiplication_InitialArrayContainsFiveElements_ResultContainsFiveElements() {
        // given
        int[] ar = {1, 2, 3, 4, 5};

        // when
        int[] result = instance.productOfElements(ar);

        // then
        assertTrue(result.length == ar.length);
    }

    @Test
    public void elementsMutiplication_InitialArrayContainsFiveElements_ElementsAreProductOfOtherInputValues() {
        // given
        int[] ar = {1, 2, 3, 4, 5};

        // when
        int[] result = instance.productOfElements(ar);

        // then
        assertTrue(result[0] == ar[1]*ar[2]*ar[3]*ar[4]);
        assertTrue(result[1] == ar[0]*ar[2]*ar[3]*ar[4]);
        assertTrue(result[2] == ar[0]*ar[1]*ar[3]*ar[4]);
        assertTrue(result[4] == ar[0]*ar[1]*ar[2]*ar[3]);
    }
}
