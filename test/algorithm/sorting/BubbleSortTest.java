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

        BubbleSort.sort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(4, array[2]);
        assertEquals(5, array[3]);
        assertEquals(8, array[4]);
    }

    @Test
    void sortWay2() {
        System.out.println("Sorting..... ");

        Integer[] array = {10, 5, 7, 1, 4, 2, 8};
        BubbleSort.print(array );

        BubbleSort.sortWay2(array);

        System.out.println("\nSort Result....");
        BubbleSort.print(array);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(4, array[2]);
        assertEquals(5, array[3]);
        assertEquals(7, array[4]);
        assertEquals(8, array[5]);
        assertEquals(10, array[6]);

        System.out.println("\nSorting..... ");
        Integer[] array2 = {5,2,1};
        BubbleSort.print(array2 );

        BubbleSort.sortWay2(array2);

        assertEquals(1, array2[0]);
        assertEquals(2, array2[1]);
        assertEquals(5, array2[2]);

        System.out.println("\nSort Result....");
        BubbleSort.print(array);
    }
}
