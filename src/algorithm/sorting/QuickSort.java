package algorithm.sorting;


public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * l: for left
     * r: for right
     */
    private static void sort(int[] array, int l, int r) {
        if(l>=r) {
            return;
        }

        // choose a pivot
        int pivot = array[(l+r)/2];

        // sort the array around this pivot and return the next partition index
        int partitionIndex = partition(array, l, r, pivot);

        sort(array, l, partitionIndex-1);
        sort(array, partitionIndex, r);
    }

    /**
     * l: for left
     * r: for right
     */
    private static int partition(int[] array, int l, int r, int pivot) {
        while (l<=r) {
            while (array[l] < pivot) {
                l++;
            }

            while (array[r] > pivot) {
                r--;
            }

            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }

        return l;
    }

    private static void swap(int[] array, int left, int right) {
        if(left==right) {
            return;
        }
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
