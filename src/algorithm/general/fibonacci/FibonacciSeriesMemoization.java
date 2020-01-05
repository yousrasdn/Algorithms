package algorithm.general.fibonacci;

/**
 * A memoization implementation of the fibonacci series: using an in memory cache, if the lookup item, is found, the cache is used.
 * This speeds up computation and avoids us from using recurison.
 */
public class FibonacciSeriesMemoization {

    private int[] memory = new int[1000];

    public int fibonacci(final int number) {
        if(memory.length <= number) {
            memory = new int[memory.length*2];
        }

        return fib(number);
    }

    private int fib(final int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (memory[number] == 0){
            memory[number] = fibonacci(number - 1) + fibonacci(number - 2);
        }

        return memory[number];
    }
}
