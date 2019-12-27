package algorithm.sorting;

import java.util.List;

public class ListToStringBuilder {
    public static String buildAStringOfArrayElements (Integer[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : array) {
            stringBuilder.append(i + ", ");
        }
        return stringBuilder.toString();
    }
    public static String buildStringOutOfListOfElements(List<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : numbers) {
            stringBuilder.append(i + ", ");
        }
        return stringBuilder.toString();
    }
}
