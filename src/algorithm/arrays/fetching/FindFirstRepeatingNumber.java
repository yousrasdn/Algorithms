package algorithm.arrays.fetching;

/**
 * Given an array of n that contains numbers from (0 to n-1), with any of these numbers appearing any number of times.
 * Find the first repeating number.
 *
 * For ex: [1, 5, 7, 3, 4, 3, 1, 2]
 */
public class FindFirstRepeatingNumber {

    /*
     * If no duplicate number is found, -1 is returned.
     *
     * Space complexity Big O = 1
     * Time complexity Big O = n
     */
    public static int findFirstRepeatingNumber(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[Math.abs(numbers[i])]<0) {
                return numbers[i];
            }

            numbers[Math.abs(numbers[i])] = -numbers[Math.abs(numbers[i])];
        }

        return -1;
    }
}