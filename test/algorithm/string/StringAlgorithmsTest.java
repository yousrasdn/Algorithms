package algorithm.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringAlgorithmsTest {

    private StringAlgorithms stringAlgorithms;

    @BeforeEach
    void setUp() {
        stringAlgorithms = new StringAlgorithms();
    }

    @Test
    void isUnique() {
        assertTrue(stringAlgorithms.isUnique("ab"));
        assertFalse(stringAlgorithms.isUnique("aba"));
        assertTrue(stringAlgorithms.isUnique("cabfeglmnipqryzstu"));
        assertFalse(stringAlgorithms.isUnique("cabfeglmnipqryzsatu"));
    }
}
