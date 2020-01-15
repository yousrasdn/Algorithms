package algorithm.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueCharactersInString {

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

    /**
     * Another way to find if string contains only unique characters
     */
    public boolean isUnique_path2(String str) {
        HashMap<Character, List<Character>> characterToCharacters = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            if(characterToCharacters.get(str.charAt(i)) == null) {
                List<Character> equalCharacters = new ArrayList<>();
                equalCharacters.add(str.charAt(i));
                characterToCharacters.put(str.charAt(i), equalCharacters);
            } else {
                return false;
            }
        }

        return true;
    }
}
