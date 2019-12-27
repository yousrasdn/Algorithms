package datastructures.arrays.dynamicarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DynamicArrayTest {

    private DynamicArray array;

    @BeforeEach
    void setUp() {
        array = new DynamicArray<String>(2);
    }

    @Test
    void get() {
        assertNull(array.get(0));
    }

    @Test
    void getAndSet() {
        array.set(0, "a");
        assertEquals("a", array.get(0));
    }

    @Test
    void insert() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.insert(1, "d");

        assertEquals("a", array.get(0));
        assertEquals("d", array.get(1));
        assertEquals("b", array.get(2));
        assertEquals("c", array.get(3));
    }

    @Test
    void delete() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(1);

        assertEquals(2, array.size());
        assertEquals("a", array.get(0));
        assertEquals("c", array.get(1));
    }

    @Test
    void DeleteLast() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(2);

        assertEquals(2, array.size());
        assertEquals("a", array.get(0));
        assertEquals("b", array.get(1));
        assertEquals(null, array.get(2));
    }

    @Test
    void isEmpty() {
        assertTrue(array.isEmpty());
        array.add("a");
        assertFalse(array.isEmpty());
    }

    @Test
    void contains()  {
        assertFalse(array.contains("a"));
        array.add("a");
        assertTrue(array.contains("a"));
    }
}
