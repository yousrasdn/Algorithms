package bubblesort;

import util.ArrayElementsBuilder;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] numbers =  new Integer[]{2, 5, 1, 9, 7, 3, 4};
        System.out.println("Welcome to the Bubble Sort Algorithm");
        System.out.println("Your input: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));

        bubbleSort(numbers);
        System.out.println("The sorted array: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));
    }

    // Ascending order sort
    private static void bubbleSort(Integer[] numbers) {
        boolean swapped = false;
        int temp;

        do { // Repeat while at least one element was swapped
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) { // Loop over the entire list and swap when two adjacent elements are out of order
                if (numbers[i+1] < numbers[i]){
                    // swap
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;

                    if(!swapped){
                        swapped = true;
                    }
                }
            }
        }while (swapped);
    }
}
