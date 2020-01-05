package datastructures.binaryheap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryMaxHeapTest {

    private BinaryMaxHeap maxHeap;

    @BeforeEach
    void setUp() {
        maxHeap = new BinaryMaxHeap();
    }

    @Test
    void insert() {
        maxHeap.insert(42);
        maxHeap.insert(29);
        maxHeap.insert(18);
        maxHeap.insert(35);
        maxHeap.insert(55);

        assertEquals(55, maxHeap.items[0]);
        assertEquals(42, maxHeap.items[1]);
        assertEquals(18, maxHeap.items[2]);
        assertEquals(29, maxHeap.items[3]);
        assertEquals(35, maxHeap.items[4]);
    }

    @Test
    void extractMax() {
        maxHeap.insert(42);
        maxHeap.insert(29);
        maxHeap.insert(18);
        maxHeap.insert(35);

        assertEquals(42, maxHeap.extractMax());
        maxHeap.print();

        assertEquals(35, maxHeap.extractMax());
        maxHeap.print();

        assertEquals(29, maxHeap.extractMax());
        maxHeap.print();

        assertEquals(18, maxHeap.extractMax());
        maxHeap.print();
    }

    @Test
    public void extractMaxBigger() {
        maxHeap.insert(42);
        maxHeap.insert(29);
        maxHeap.insert(18);
        maxHeap.insert(14);
        maxHeap.insert(7);
        maxHeap.insert(18);
        maxHeap.insert(12);
        maxHeap.insert(11);
        maxHeap.insert(13);

        assertEquals(42, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(29, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(18, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(18, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(14, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(13, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(12, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(11, maxHeap.extractMax());
        maxHeap.print();
        assertEquals(7, maxHeap.extractMax());
        maxHeap.print();
    }
}
