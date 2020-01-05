package algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] numbers =  new Integer[]{2, 5, 1, 9, 7, 3, 4};
        System.out.println("Welcome to the Bubble Sort Algorithm");
        System.out.println("Your input: " + ListToStringBuilder.buildAStringOfArrayElements(numbers));

        sort(numbers);
        System.out.println("The sorted array: " + ListToStringBuilder.buildAStringOfArrayElements(numbers));
    }

    // Ascending order sort
    public static void sort(Integer[] numbers) {
        if(numbers==null || numbers.length==0)
            return;

        boolean swapped;
        int temp;

        do { // Repeat while at least one element was swapped
            swapped = false;

            for (int i = 0; i < numbers.length - 1; ++i) { // Loop over the entire list and swap when two adjacent elements are out of order
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

    public static void sortWay2(Integer[] numbers) {
        if(numbers == null || numbers.length == 0 || numbers.length ==1) {
            return;
        }

        int sortDelimiter = numbers.length - 1;
        for (int i=0; i <= sortDelimiter; i++) {
            for (int j = 0; j <= sortDelimiter-1; j++ ) {
                if(numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

            sortDelimiter--;
        }
    }

    public static void print(Integer[] a ) {
         for (int i = 0; i < a.length; i++) {
             System.out.print(" " + a[i]);
         }
    }


}
