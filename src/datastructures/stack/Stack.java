package datastructures.stack;

public class Stack {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;


    public int pop() {
        checkIfHeadIsPresent();

        int lastPushedValue = head.data;

        head = head.next;

        return lastPushedValue;
    }

    public void push(final int value) {
        Node newNode = new Node(value);

        newNode.next = head;

        head = newNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the top value in the stack
     */
    public int peek() {
        return head.data;
    }

    public int size() {
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;

            current = current.next;
        }

        return counter;
    }

    private void checkIfHeadIsPresent() {
        if(head == null) {
            throw new IllegalStateException("There is no element in the list.");
        }
    }
}
