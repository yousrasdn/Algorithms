package algorithm.general.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A naive implementation of the fibonacci series
 */
class FibonacciSeriesTest {

    private FibonacciSeriesNaive naive;
    private FibonacciSeriesMemoization memo;

    @BeforeEach
    void SetUp() {
        naive = new FibonacciSeriesNaive();
        memo = new FibonacciSeriesMemoization();
    }

    @Test
    void naive() {
        assertEquals(0, naive.fibonacci(0));
        assertEquals(1, naive.fibonacci(1));
        assertEquals(1, naive.fibonacci(2));
        assertEquals(2, naive.fibonacci(3));
        assertEquals(3, naive.fibonacci(4));
        assertEquals(5, naive.fibonacci(5));
        assertEquals(8, naive.fibonacci(6));
        assertEquals(13, naive.fibonacci(7));
        assertEquals(21, naive.fibonacci(8));
    }

    @Test
    void memoized() {
        assertEquals(0, memo.fibonacci(0));
        assertEquals(1, memo.fibonacci(1));
        assertEquals(1, memo.fibonacci(2));
        assertEquals(2, memo.fibonacci(3));
        assertEquals(3, memo.fibonacci(4));
        assertEquals(5, memo.fibonacci(5));
        assertEquals(8, memo.fibonacci(6));
        assertEquals(13, memo.fibonacci(7));
        assertEquals(21, memo.fibonacci(8));
    }

    @Test
    void recordTimeNaive() {
        long startTime = System.currentTimeMillis();
        naive.fibonacci(40);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 19s
    }

    @Test
    void recordTimeMemoized() {
        long startTime = System.currentTimeMillis();
        memo.fibonacci(1000);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 20s
    }
}
