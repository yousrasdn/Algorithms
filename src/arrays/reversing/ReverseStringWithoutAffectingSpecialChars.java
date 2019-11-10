package arrays.reversing;

/**
 * Reverse a string without affecting special characters
 * Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
 * reverse the string in a way that special characters are not affected.
 * Source: https://www.geeksforgeeks.org/reverse-a-string-without-affecting-special-characters/
 */
public class ReverseStringWithoutAffectingSpecialChars {

    public static void main(String[] args) {
        reverse("ab$c,");
        reverse("w.b$d,de!$");

    }

    private static void reverse(String input) {
        System.out.printf("Reversing: %s%n", input);

        char[] chars = input.toCharArray();

        int leftEdge = 0, rightEdge = input.length() - 1;

        while (rightEdge > leftEdge) {
            if(!Character.isAlphabetic(chars[rightEdge])) {
              rightEdge--;
            } else if(!Character.isAlphabetic(chars[leftEdge])) {
                leftEdge++;
            } else {
                char temp = chars[rightEdge];
                chars[rightEdge] = chars[leftEdge];
                chars[leftEdge] = temp;

                rightEdge--;
                leftEdge++;
            }
        }

        System.out.printf("=> Result: %s%n", new String(chars));
    }
}
