package algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    @Test
    void sort() {
        int[] array = {15, 3, 2, 1, 9, 5, 7, 8, 6};

        QuickSort.sort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(5, array[3]);
        assertEquals(6, array[4]);
        assertEquals(7, array[5]);
        assertEquals(8, array[6]);
        assertEquals(9, array[7]);
        assertEquals(15, array[8]);

        QuickSort.printArray(array);
    }
}
