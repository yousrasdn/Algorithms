package algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Replace all the spaces in a string with the ASCII character‘%20’.
 * Preconditions: the final length of the string is given
 */
public class URLifyString {

    public static String urlIfy(String input, int finalInputLength) {
        char[] urlifiedStringCharacters = new char[finalInputLength];

        char[] inputChars = input.toCharArray();

        int currentCharPosition = 0;

        for (int i=0; i< inputChars.length; i++) {
            if(inputChars[i]==' ') {
                urlifiedStringCharacters[currentCharPosition] = '%';
                urlifiedStringCharacters[currentCharPosition + 1] = '2';
                urlifiedStringCharacters[currentCharPosition + 2] = '0';
                currentCharPosition = currentCharPosition + 3;
            } else {
                urlifiedStringCharacters[currentCharPosition] = inputChars[i];
                currentCharPosition++;
            }
        }

        return new String(urlifiedStringCharacters);
    }
}
