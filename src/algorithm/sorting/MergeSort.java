package algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(){{
            add(2);
            add(10);
            add(5);
            add(1);
            add(4);
        }};
        System.out.println("Welcome to the Merge Sort Algorithm");
        System.out.println("Your input: " + ListToStringBuilder.buildStringOutOfListOfElements(numbers));
        mergeSort(numbers);
        System.out.println("The sorted array: " + ListToStringBuilder.buildStringOutOfListOfElements(mergeSort(numbers)));
    }

    /**
     * Way 1 for Merge Sort algorithm
     */
    public static List<Integer> mergeSort(List<Integer> numbers) {
        if(numbers.size()==1) // The array is already sorted
            return numbers;

        List<Integer> leftPart = numbers.subList(0, numbers.size()/2);
        List<Integer> rightPart = numbers.subList(numbers.size()/2, numbers.size());

        leftPart = mergeSort(leftPart);
        rightPart = mergeSort(rightPart);

        return merge(new ArrayList<>(leftPart),new ArrayList<>(rightPart));
    }

    private static List<Integer> merge(List<Integer> leftPart, List<Integer> rightPart) {
        List<Integer> mergedAndSorted = new ArrayList<>();

        // As long as there are elements remaining in both parts,
        // Compare individual elements in both parts before merging them
        while (leftPart.size()>0 && rightPart.size()>0) {
            if(leftPart.get(0) > rightPart.get(0)) {
                mergedAndSorted.add(rightPart.get(0));
                rightPart.remove(0);
            }else {
                mergedAndSorted.add(leftPart.get(0));
                leftPart.remove(0);
            }
        }

        while (leftPart.size()>0) {
            mergedAndSorted.add(leftPart.get(0));
            leftPart.remove(0);
        }
        while (rightPart.size()>0) {
            mergedAndSorted.add(rightPart.get(0));
            rightPart.remove(0);
        }

        return mergedAndSorted;
    }


    /**
     * Second way for the merge sort algorithm
     */
    public static void sortWay2(int[] ar){
        if(ar == null) {
            throw new IllegalStateException();
        }

        if(ar.length == 0 || ar.length == 1) {
            return;
        }

        divide(ar, 0, ar.length - 1);
    }

    /**
     * Sorting using Merge sort algorithm (Divide, then Conquer by merging)
     * @param array the array to be sorted
     * @param l the starting point index
     * @param r the ending point index
     */
    private static void divide(int[] array, int l, int r) {
        System.out.println("dividing l r: "+ l + " " + r);

        if (l<r) { // as long as there are elements that still can be divided, keep going
            int middle = (l+r)/2;

            divide(array, l, middle);
            divide(array, middle+1, r);

            merge(array, l, middle, r);
        }
    }

    // Merges the left subarray with the right subarray
    private static void merge(int[] array, int l, int middle, int r) {
        System.out.println(String.format("merging l m r: %d %d %d", l, middle, r));

        // size of the two subarrays
        int size1 = middle - l + 1;
        int size2 = r - middle;

        // create temporal two subarrays
        int arrayL[] = new int [size1];
        int arrayR[] = new int [size2];

        // copy data to temp arrays
        for (int i=0; i<size1; ++i)
            arrayL[i] = array[l + i];
        for (int j=0; j<size2; ++j)
            arrayR[j] = array[middle + 1+ j];

        // merge the two subarrays
        int i = 0, j = 0, k=l;

        // copy elements of both left and right arrays
        while (i < size1 && j < size2)
        {
            if (arrayL[i] <= arrayR[j])
            {
                array[k] = arrayL[i];
                i++;
            }
            else
            {
                array[k] = arrayR[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left array if any
        while (i < size1)
        {
            array[k] = arrayL[i];
            i++;
            k++;
        }

        // copy remaining elements of right array if any
        while (j < size2)
        {
            array[k] = arrayR[j];
            j++;
            k++;
        }

        System.out.println("After merge: ");
        printArray(array);
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
