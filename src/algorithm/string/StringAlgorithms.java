package algorithm.string;

public class StringAlgorithms {

    /**
     * Find if string contains only unique characters
     * Preconditions: we only want to cover the 128 unique characters defined in ASCII.
     */
    public boolean isUnique(String str) {
        if(str.length() > 128) {
            return false;
        }

        boolean[] chars_status = new boolean[128];

        for (int i=0; i<str.length(); i++) {
            int current = str.charAt(i);
            if(chars_status[current]) {
                return false;
            }
            chars_status[current] = true;
        }

        return true;
    }
}
