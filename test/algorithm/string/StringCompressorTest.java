package algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressorTest {

    @Test
    void compress() {
        assertEquals("a3b2c2", StringCompressor.compress("aaabbcc"));
        assertEquals("babbbb", StringCompressor.compress("babbbb"));
        assertEquals("aabb", StringCompressor.compress("aabb"));
        assertEquals("ab", StringCompressor.compress("ab"));
        assertEquals("abc", StringCompressor.compress("abc"));
        assertEquals("z3", StringCompressor.compress("zzz"));
        assertEquals("aabbaabb", StringCompressor.compress("aabbaabb"));
    }
}
