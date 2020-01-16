package algorithm.string;

import java.util.Arrays;

/**
 * Find whether a string is a permutation of another
 */
public class IsStringPermutationOfAnother {

    public static boolean isStringPermutationOfAnoter(final String a, final String b) {
        if(a.length() != b.length()) {
            return false;
        }

        String sortedA = sortString(a);

        String sortedB = sortString(b);

        return sortedA.equalsIgnoreCase(sortedB);
    }

    private static String sortString(String str) {
        char[] aChars = str.toCharArray();
        Arrays.sort(aChars);

        return new String(aChars);
    }
}
