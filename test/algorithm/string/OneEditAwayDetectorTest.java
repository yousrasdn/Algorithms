package algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneEditAwayDetectorTest {

    @Test
    void isOneEditAway_CaseOneWayReplace() {
        assertTrue(OneEditAwayDetector.isOneEditAway("abcd","abed"));
    }

    @Test
    void isOneEditAway_CaseOneWayReplace_Test2() {
        assertTrue(OneEditAwayDetector.isOneEditAway("a","b"));
    }

    @Test
    void isOneEditAway_CaseZeroWayReplace() {
        assertTrue(OneEditAwayDetector.isOneEditAway("",""));
    }

    @Test
    void isOneEditAway_CaseZeroWayReplace_Test2() {
        assertTrue(OneEditAwayDetector.isOneEditAway("a","a"));
    }

    @Test
    void isOneEditAway_CaseManyWayReplace() {
        assertFalse(OneEditAwayDetector.isOneEditAway("abcd","aaedwacd"));
    }

    @Test
    void isOneEditAway_CaseOneInsertReplace() {
        assertTrue(OneEditAwayDetector.isOneEditAway("ab","abc"));
    }

    @Test
    void isOneEditAway_CaseOneInsertReplace_Test2() {
        assertTrue(OneEditAwayDetector.isOneEditAway("abcdef","abcef"));
    }

    @Test
    void isOneEditAway_CaseOneInsertReplace_Test3() {
        assertTrue(OneEditAwayDetector.isOneEditAway("ab","aeb"));
    }

    @Test
    void isOneEditAway_CaseOneInsertReplace_Test4() {
        assertTrue(OneEditAwayDetector.isOneEditAway("abc","bc"));
    }

    @Test
    void isOneEditAway_CaseMutlipleInsertReplace_Test2() {
        assertFalse(OneEditAwayDetector.isOneEditAway("abcdef","abref"));
    }

    @Test
    void isOneEditAway_MultipleAssertions() {
        assertFalse(OneEditAwayDetector.isOneEditAway("pale", "paleXXXX"));

        assertTrue(OneEditAwayDetector.isOneEditAway("pale", "ple"));
        assertTrue(OneEditAwayDetector.isOneEditAway("pales", "pale"));
        assertTrue(OneEditAwayDetector.isOneEditAway("pale", "bale"));
        assertFalse(OneEditAwayDetector.isOneEditAway("pale", "bake"));

        assertTrue(OneEditAwayDetector.isOneEditAway("pale", "aale"));
        assertTrue(OneEditAwayDetector.isOneEditAway("pale", "pble"));
        assertTrue(OneEditAwayDetector.isOneEditAway("pale", "palk"));

        assertFalse(OneEditAwayDetector.isOneEditAway("pale", "bakeerer"));
    }
}
