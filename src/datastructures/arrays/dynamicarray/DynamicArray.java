package datastructures.arrays.dynamicarray;

public class DynamicArray<T> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    /**
     * Complexity: O(1)
     */
    public String get(int index) {
        validateIndex(index);

        return (String)data[index];
    }

    /**
     * Complexity: O(1)
     */
    public void set(int index, String value) {
        validateIndex(index);

        if(data[index]==null) {
            size++;
        }

        data[index] = value;
    }

    /**
     * Complexity: O(n)
     */
    public void insert(int index, String value) {
        validateIndex(index);

        // check size
        if(size == initialCapacity) {
            resize();
        }

        // shift every element from [index to size[ one cell to the right.
        for(int i=size; i>index; i--) {
            data[i] = data[i-1];
        }

        // do the insert
        data[index] = value;
        size++;
    }

    /**
     * Complexity: O(n)
     */
    public void delete(int index) {
        validateIndex(index);

        if(index==size) {
            data[index]=null;
            size--;
            return;
        }

        // shift to the left
        for (int i=index+1; i<=size; i++) {
            data[i-1] = data[i];
        }
        size--;
    }

    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Complexity: O(n)
     */
    public boolean contains(String value) {
        for (int i=0; i<size; i++) {
            if(data[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i=0;i< size;i++) {
            System.out.println("data[i] = " + data[i]);
        }
    }

    public void add(String value) {
        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

    private void validateIndex(int index) {
        if (index >= initialCapacity) {
            throw new IllegalArgumentException(String.format("The provided index (%d) is more than the array's initialCapacity (%d).", index, initialCapacity));
        }
    }
}
