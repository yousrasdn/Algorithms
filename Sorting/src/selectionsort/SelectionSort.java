package selectionsort;

import util.ArrayElementsBuilder;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] numbers =  new Integer[]{2, 5, 1, 9, 7, 3, 4};
        System.out.println("Welcome to the Selection Sort Algorithm");
        System.out.println("Your input: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));

        seletionSort(numbers);
        System.out.println("The sorted array: " + ArrayElementsBuilder.buildAStringOfArrayElements(numbers));
    }

    private static void seletionSort(Integer[] numbers) {
        int min = 0;
        for(int i=0; i<numbers.length; i++) {
            min=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[min]>numbers[j]){
                    min = j;
                }
            }
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i]=temp;
        }
    }
}
