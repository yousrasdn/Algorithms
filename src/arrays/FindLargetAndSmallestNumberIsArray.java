package arrays;

public class FindLargetAndSmallestNumberIsArray {

    /**
     * Find the largest and smallest number in an unsorted integer array
     */

    public static void main(String[] args) {
        int[] arr = {1,5,7,2,0,4};

        findTargetNumbers(arr);
    }

    /**
     * Finds the largest and smallest numbers in an unsorted integer array
     */
    private static void findTargetNumbers(int[] arr) {
        var smallest = arr[0];
        var largest = arr[0];

        for(int i=0; i < arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }

            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }
}
