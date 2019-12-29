package datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    void SetUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        assertEquals(3, linkedList.getFirst());
        assertEquals(1, linkedList.getLast());
    }

    @Test
    void getFirst() {
        linkedList.addFront(1);
        assertEquals(1, linkedList.getFirst());
    }

    @Test
    void getLast() {
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);

        assertEquals(3, linkedList.getLast());
    }

    @Test
    void addBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());
    }

    @Test
    public void size() {
        assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        assertEquals(2, linkedList.size());
        linkedList.addFront(3);
        assertEquals(3, linkedList.size());
    }

    @Test
    public void clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        assertEquals(0, linkedList.size());
    }

    @Test
    public void deleteFromTheList() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.delete(2);

        assertEquals(2, linkedList.size());
        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());
    }

    @Test
    public void deleteLastValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.addBack(4);

        linkedList.delete(4);

        assertEquals(3, linkedList.size());
        assertEquals(1, linkedList.getFirst());
        assertEquals(3, linkedList.getLast());

       linkedList.print();
    }

}
