package algorithm.general.fibonacci;

/**
 * A naive implementation of the fibonacci series
 *
 * Time complexity: O(2^n)
 */
public class FibonacciSeriesNaive {

    public int fibonacci(final int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
