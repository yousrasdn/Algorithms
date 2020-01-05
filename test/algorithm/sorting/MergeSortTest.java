package algorithm.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {

    @Test
    void sortWay1() {
        //           l                  r
        List<Integer> arr = new ArrayList<>(){{
            add(4);
            add(7);
            add(14);
            add(1);
            add(3);
            add(9);
            add(17);
        }};

        List<Integer> result = MergeSort.mergeSort(arr);

        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(7, result.get(3));
        assertEquals(9, result.get(4));
        assertEquals(14, result.get(5));
        assertEquals(17, result.get(6));
    }

    @Test
    void sortWay2() {
        //           l                  r
        int arr[] = {4, 7, 14, 1, 3, 9, 17};

        MergeSort.sortWay2(arr);

        assertEquals(1, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(9, arr[4]);
        assertEquals(14, arr[5]);
        assertEquals(17, arr[6]);

        System.out.println("\nSorted array");
        MergeSort.printArray(arr);
    }
}
