package insertionsort;

import util.ArrayElementsBuilder;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] numbers =  new Integer[]{2, 5, 1, 9, 7, 3, 4};
        System.out.println("Welcome to the Insertion Sort Algorithm");
        System.out.println("Your input: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));

        insertionSort(numbers);
        System.out.println("The sorted array: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));
    }

    private static void insertionSort(Integer[] numbers) {
        if(numbers==null || numbers.length==0)
            return;

        int indexOfCurrent;
        for (int i=1; i<numbers.length; i++) {
            int current = numbers[i];
            int j = i;
            while( j>0 && numbers[j-1]>current) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = current;
        }

    }
}
