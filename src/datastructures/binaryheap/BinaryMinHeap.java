package datastructures.binaryheap;

import java.util.Arrays;

/**
 * A binary max heap implementation using an integer heap.
 * The implementation uses an array.
 */
public class BinaryMinHeap {

    private int capacity = 10;
    private int size = 0;

    public int[] items = new int[capacity];

    private int leftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
    private int rightChildIndex(int parentIndex) { return 2 * parentIndex + 2; }
    private int parentIndex(int childIndex ) { return (childIndex - 1) / 2; }

    private boolean hasLeftChild(int index) { return leftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return rightChildIndex(index) < size; }
    private boolean hasParent(int index) { return parentIndex(index) >= 0; }

    private int getLeftChild(int index) { return items[leftChildIndex(index)]; }
    private int getRightChild(int index) { return items[rightChildIndex(index)]; }
    private int getParent(int index) { return items[parentIndex(index)]; }

    public int peek() {
        return items[0];
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("There are no items.");
        }

        final int min = peek();
        items[0] = items[size - 1];
        size--;
        heapifyDown();

        return min;
    }

    public void insert(int item) {
        verifyCapcity();
        items[size] = item;
        size++;
        heapifyUp(); // If the item is less than its parent, move it up
    }

    public void heapifyUp() {
        int index = size - 1; // the index of the last element inserted

        while (hasParent(index) && getParent(index) > items[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index); // after the swap, the last element inserted has moved upwards.
        }
    }

    private void swap(int a, int b) {
        int temp = items[a];
        items[a] = items[b];
        items[b] = temp;
    }

    public void heapifyDown() {
        int index = 0; // starting at the top

        while (hasLeftChild(index)) {
            int smallestChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallestChildIndex = getRightChild(index);
            }

            if(items[index] < items[smallestChildIndex]) {
                break;
            } else {
                swap(index, smallestChildIndex);
            }

            index = smallestChildIndex;
        }
    }

    private void verifyCapcity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public void print() {
        for (int i=0; i < size; i++) {
            System.out.println(i + "[" + items[i] + "]" );
        }
        System.out.println();
    }
}
