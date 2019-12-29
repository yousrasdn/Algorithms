package datastructures.linkedlist;

public class LinkedList {

    private static class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void addFront(int data) {
        Node node = new Node(data);

        // if head is null, set the head to be the new node
        if(head==null) {
            head = node;
            return;
        }

        // set the new node next to head
        node.next = head;

        // make head be the new node
        head = node;
    }

    public void addBack(int data) {
        Node node = new Node(data);

        // if head is null, set the head to be the new node
        if(head==null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
    }

    public int getFirst() {
        checkIfHeadIsPresent();

        return head.data;
    }

    public int getLast() {
        checkIfHeadIsPresent();

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        if(head == null) {
            return 0;
        }

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
