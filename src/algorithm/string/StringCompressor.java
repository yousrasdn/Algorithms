package algorithm.string;

import java.util.HashMap;
import java.util.Map;

// Given a string with repeating characters,
// the algortihm should compress the string down to the character, followed by the number of times it appears in the string.
// If the compressed string is not smaller than original, the original is returned,
// ex: aaabbcc => a3b2c2
public class StringCompressor {

    public static String compress(String input) {
        StringBuilder output = new StringBuilder();

        int counter = 0;

        for (int i=0; i<input.length(); i++) {
            counter++;

            if (i+1 >= input.length() || input.charAt(i) != input.charAt(i+1)) {
                output.append(input.charAt(i));
                output.append(counter);
                counter = 0;
            }
        }
        return output.length() < input.length() ? output.toString() : input;
    }
}
