package algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLifyStringTest {

    @Test
    void urlIfy() {
        assertEquals("ab%20cd", URLifyString.urlIfy("ab cd", 7));
        assertEquals("abcd%20%20efg", URLifyString.urlIfy("abcd  efg", 13));
    }
}
