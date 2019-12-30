package datastructures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void push() {
        stack.push(1);
        assertEquals(1, stack.peek());
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    void pop() {
        assertThrows(IllegalStateException.class, () -> stack.pop());

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);

        int result = stack.pop();

        assertEquals(7, result);
        assertEquals(5, stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
        stack.push(3);
        assertEquals(3, stack.size());
    }
}
