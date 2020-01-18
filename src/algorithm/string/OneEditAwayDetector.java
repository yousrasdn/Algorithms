package algorithm.string;

/**
 * Given two strings, find if they are one edit away from each other.
 * Ex. {"abc","ab"}->true, {"abc","adc"}->true, {"abc","cab"}->false
 */
public class OneEditAwayDetector {

    public static boolean isOneEditAway(String input, String output) {
        if(Math.abs(input.length() - output.length()) > 1) {
            return false;
        } else if(input.length() == output.length()) {
            return isOneReplaceAway(input, output);
        } else if(input.length() + 1 == output.length()) {
            return isOneInsertAway(input, output);
        } else if(input.length() -1 == output.length()) {
            return isOneInsertAway(output, input);
        }

        return true;
    }

    private static boolean isOneReplaceAway(String s1, String s2) {
        boolean atLeastOneCharacterIsDifferent = false;

        for (int i =0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (atLeastOneCharacterIsDifferent) {
                    return false;
                }

                atLeastOneCharacterIsDifferent = true;
            }
        }

        return true;
    }

    private static boolean isOneInsertAway(String s1, String s2) {
        int numberOfInsertsRequired = 0;

        String longestString   = s1.length() > s2.length() ? s1 : s2;
        String shortestString  = s1.length() < s2.length() ? s1 : s2;

        for (int i=0; i<longestString.length(); i++) {
            if (shortestString.indexOf(longestString.charAt(i))==-1) {
                numberOfInsertsRequired++;
            }
        }

        return numberOfInsertsRequired<=1;
    }
}
