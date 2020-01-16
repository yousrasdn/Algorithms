package algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsStringPermutationOfAnotherTest {

    @Test
    void isStringPermutationOfAnoter() {
        assertTrue(IsStringPermutationOfAnother.isStringPermutationOfAnoter("abc", "bac"));
        assertFalse(IsStringPermutationOfAnother.isStringPermutationOfAnoter("abc", "dac"));
    }
}
