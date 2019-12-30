package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QueueTest {
    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void queue() {
        assertTrue(queue.isEmpty());
        queue.queue(1);
        assertEquals(1, queue.size());
        queue.queue(2);
        assertEquals(2, queue.size());
    }

    @Test
    void dequeue() {
        assertTrue(queue.isEmpty());
        queue.queue(1);
        assertFalse(queue.isEmpty());

        int result = queue.dequeue();

        assertEquals(1, result);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());

        assertThrows(IllegalStateException.class, () -> queue.dequeue());

        queue.queue(3);
        queue.queue(5);
        queue.queue(7);

        result = queue.dequeue();
        assertEquals(3, result);
        assertEquals(2, queue.size());

        result = queue.dequeue();
        assertEquals(5, result);
        assertEquals(1, queue.size());

        result = queue.dequeue();
        assertEquals(7, result);
        assertTrue(queue.isEmpty());
    }
}
