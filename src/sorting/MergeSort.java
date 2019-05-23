package sorting;

import util.ListToStringBuilder;

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
            add(9);
            add(7);
            add(3);
            add(4);
            add(0);
        }};
        System.out.println("Welcome to the Merge Sort Algorithm");
        System.out.println("Your input: " + ListToStringBuilder.buildStringOutOfListOfElements(numbers));

        mergeSort(numbers);
        System.out.println("The sorted array: " + ListToStringBuilder.buildStringOutOfListOfElements(mergeSort(numbers)));

    }

    private static List<Integer> mergeSort(List<Integer> numbers) {
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
}
