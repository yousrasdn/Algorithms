package util;

public class ArrayElementsBuilder {
    public static String buildAStringOfArrayElements (Integer[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : array) {
            stringBuilder.append(i + ", ");
        }
        return stringBuilder.toString();
    }
}
