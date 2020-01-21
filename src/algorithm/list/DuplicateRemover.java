package algorithm.list;

import java.util.HashSet;

/**
 * This class answers the following problem:
 * Given a list, remove the duplicate values (refer to removeDuplicates method for the implementation)
 */
public class DuplicateRemover {

    private Node head;
    private int size;

    private class Node {
        private int value;
        private Node next;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(int value) {
        if(head == null) {
            this.head = new Node(value, null);
            this.size++;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value, null);
        this.size++;
    }

    public void removeDuplicates() {
        removeDuplicates(head);
    }

    private void removeDuplicates(Node input) {
        if(input == null) {
            throw new IllegalArgumentException("Received null node.");
        } else if(head==null) {
            throw new IllegalStateException("The list is empty");
        }


        HashSet<Integer> uniqueValues = new HashSet<>();

        Node current = head;
        Node previous = null;

        while (current != null) {
            if(uniqueValues.contains(current.value)) {
                previous.next = current.next;
                this.size--;
            } else {
                uniqueValues.add(current.value);
                previous = current;
            }

            current = current.next;
        }
    }

    public int size() {
        return this.size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println();
    }
}
