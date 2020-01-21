package algorithm.list;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfTwoListsTest {

    @Test
    void sumOfTwoLists() {
        SumOfTwoLists sumOfTwoLists = new SumOfTwoLists();

        Stack first = new Stack();
        first.push(8);
        first.push(2);
        first.push(5);

        Stack second = new Stack();
        second.push(4);
        second.push(9);
        second.push(2);

        Stack sum = sumOfTwoLists.sum(first, second);

        assertEquals(3, sum.size());

        while (!sum.isEmpty()) {
            assertEquals(8, sum.pop());
            assertEquals(2, sum.pop());
            assertEquals(2, sum.pop());
        }
    }

    @Test
    void sumOfTwoLists_2() {
        SumOfTwoLists sumOfTwoLists = new SumOfTwoLists();

        Stack first = new Stack();
        first.push(5);
        first.push(6);
        first.push(3);

        Stack second = new Stack();
        second.push(8);
        second.push(4);
        second.push(2);

        Stack sum = sumOfTwoLists.sum(first, second);

        assertEquals(3, sum.size());

        while (!sum.isEmpty()) {
            assertEquals(6, sum.pop());
            assertEquals(1, sum.pop());
            assertEquals(3, sum.pop());
        }
    }

    @Test
    void sumOfTwoLists_3() {
        SumOfTwoLists sumOfTwoLists = new SumOfTwoLists();

        Stack first = new Stack();
        first.push(1);
        first.push(7);
        first.push(9);
        first.push(9);
        first.push(9);

        Stack second = new Stack();
        second.push(8);
        second.push(9);
        second.push(9);

        Stack sum = sumOfTwoLists.sum(first, second);

        assertEquals(6, sum.size());

        while (!sum.isEmpty()) {
            assertEquals(1, sum.pop());
            assertEquals(0, sum.pop());
            assertEquals(0, sum.pop());
            assertEquals(9, sum.pop());
            assertEquals(6, sum.pop());
            assertEquals(9, sum.pop());
        }
    }
}
