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
    private int size = 0;

    public void addFront(final int data) {
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

        size++;
    }

    public void addBack(final int data) {
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

        size++;
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
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;

            current = current.next;
        }

        return counter;
    }

    public void clear() {
        head = null;
    }

    public void delete(final int lookUpValue) {
        if(head == null) {
            return;
        }

        if(head.data == lookUpValue) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if(current.next.data == lookUpValue) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("");
    }

    private void checkIfHeadIsPresent() {
        if(head == null) {
            throw new IllegalStateException("There is no element in the list.");
        }
    }
}
