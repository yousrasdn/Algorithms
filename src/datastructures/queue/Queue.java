package datastructures.queue;

public class Queue {

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void queue(final int data) {
        Node newNode = new Node(data);

        if (tail != null) {
            tail.next = newNode;
        }

        tail = newNode;

        if (head == null) {
            head = tail;
        }
    }

    public int dequeue() {
        checkIfTailIsPresent();

        int firstElement = head.data;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        return firstElement;
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

    private void checkIfTailIsPresent() {
        if(tail == null) {
            throw new IllegalStateException("There is no element in the queue.");
        }
    }

}
