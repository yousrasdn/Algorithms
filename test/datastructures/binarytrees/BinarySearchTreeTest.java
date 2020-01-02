package datastructures.binarytrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void insert() {
        bst.insert(8, "a");
        bst.insert(3, "b");
        bst.insert(4, "c");
        bst.insert(7, "d");
        bst.insert(9, "e");
        bst.insert(2, "f");
        bst.insert(5, "g");
        assertThrows(IllegalArgumentException.class, () -> bst.insert(8, "h"));

        assertEquals("a", bst.find(8));
        assertEquals("b", bst.find(3));
        assertEquals("c", bst.find(4));
        assertEquals("d", bst.find(7));
        assertEquals("e", bst.find(9));
        assertEquals("f", bst.find(2));
        assertEquals("g", bst.find(5));
        assertEquals(null, bst.find(12));

//        bst.printInOrderTraversal();
//        bst.printPreOrderTraversal();
        bst.printPostOrderTraversal();
    }

    @Test
    public void findMinKey() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");

        assertEquals(2, bst.findMinKey());
    }

    @Test
    public void delete_givenNodeToDeleteHasNoChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        bst.delete(2);

        assertNull(bst.find(2));
        bst.printInOrderTraversal();
    }

    @Test
    public void delete_givenNodeToDeleteHasOneChild() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");

        bst.delete(7);

        assertNull(bst.find(7));
        bst.printInOrderTraversal();
    }

    @Test
    public void delete_givenNodeToDeleteHasTwoChildren() {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        bst.delete(7);

        assertNull(bst.find(7));
        bst.printInOrderTraversal();
    }
}
