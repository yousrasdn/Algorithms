package algorithm.arrays.fetching;

import java.util.Arrays;

/**
 * Find  if array contains an element
 */
public class FindIfArrayContainsAnElement {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        int element = 4;
        System.out.printf("Is %d present in array? %b%n", element, findIfArrayContainsElementWayOne(arr, element));

        String[] arr2 = {"a","hello", "why", "bye", "world", "tree", "map"};
        String element2 = "world";
        System.out.printf("Is %s present in array? %b%n", "world", findIfArrayContainsElementWayOne(arr2, element2));

    }

    private static <T> boolean findIfArrayContainsElementWayOne(T[] arr, T element) {
        for (int i=0; i<arr.length; i++) {
            if(arr[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    private static <T> boolean findIfArrayContainsElementWayTwo(T[] arr, T element) {
        return Arrays.asList(arr).contains(element);
    }

}
