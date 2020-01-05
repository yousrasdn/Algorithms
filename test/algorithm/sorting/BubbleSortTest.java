package algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void SetUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void sortWay1() {
        Integer[] array = {5, 1, 4, 2, 8};

        Integer[] sorted = BubbleSort.sort(array);

        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(4, sorted[2]);
        assertEquals(5, sorted[3]);
        assertEquals(8, sorted[4]);
    }

    @Test
    void sortWay2() {
        System.out.println("Sorting..... ");

        Integer[] array = {10, 5, 7, 1, 4, 2, 8};
        BubbleSort.print(array );

        Integer[] sorted = BubbleSort.sortWay2(array);

        System.out.println("\nSort Result....");
        BubbleSort.print(sorted);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(4, sorted[2]);
        assertEquals(5, sorted[3]);
        assertEquals(7, sorted[4]);
        assertEquals(8, sorted[5]);
        assertEquals(10, sorted[6]);

        System.out.println("\nSorting..... ");
        Integer[] array2 = {5,2,1};
        BubbleSort.print(array2 );

        sorted = BubbleSort.sortWay2(array2);

        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(5, sorted[2]);

        System.out.println("\nSort Result....");
        BubbleSort.print(sorted);
    }
}
