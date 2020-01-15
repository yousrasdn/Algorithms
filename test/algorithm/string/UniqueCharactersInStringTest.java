package algorithm.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueCharactersInStringTest {

    private UniqueCharactersInString uniqueCharactersInString;

    @BeforeEach
    void setUp() {
        uniqueCharactersInString = new UniqueCharactersInString();
    }

    @Test
    void isUnique() {
        assertTrue(uniqueCharactersInString.isUnique("ab"));
        assertFalse(uniqueCharactersInString.isUnique("aba"));
        assertTrue(uniqueCharactersInString.isUnique("cabfeglmnipqryzstu"));
        assertFalse(uniqueCharactersInString.isUnique("cabfeglmnipqryzsatu"));
    }

    @Test
    void isUnique_path2() {
        assertTrue(uniqueCharactersInString.isUnique_path2("ab"));
        assertFalse(uniqueCharactersInString.isUnique_path2("aba"));
        assertTrue(uniqueCharactersInString.isUnique_path2("cabfeglmnipqryzstu"));
        assertFalse(uniqueCharactersInString.isUnique_path2("cabfeglmnipqryzsatu"));
    }
}
