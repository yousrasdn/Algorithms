package datastructures.binaryheap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryMinHeapTest {

    private BinaryMinHeap minHeap;

    @BeforeEach
    void setUp() {
        minHeap = new BinaryMinHeap();
    }

    @Test
    void insert() {
        minHeap.insert(50);
        minHeap.insert(42);
        minHeap.insert(17);
        minHeap.insert(5);
        minHeap.insert(14);

        assertEquals(5, minHeap.items[0]);
        assertEquals(14, minHeap.items[1]);
        assertEquals(42, minHeap.items[2]);
        assertEquals(50, minHeap.items[3]);
        assertEquals(17, minHeap.items[4]);
        minHeap.print();
    }

    @Test
    void extractMin() {
        minHeap.insert(50);
        minHeap.insert(42);
        minHeap.insert(17);
        minHeap.insert(5);
        minHeap.insert(14);

        assertEquals(5, minHeap.extractMin());
        minHeap.print();

        assertEquals(14, minHeap.extractMin());
        minHeap.print();

        assertEquals(17, minHeap.extractMin());
        minHeap.print();

        assertEquals(42, minHeap.extractMin());
        minHeap.print();

        assertEquals(50, minHeap.extractMin());
        minHeap.print();
    }
}
