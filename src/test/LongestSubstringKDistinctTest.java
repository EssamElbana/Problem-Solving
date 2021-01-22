package test;

import main.LongestSubstringKDistinct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKDistinctTest {

    @Test
    void findLength() {
        assert LongestSubstringKDistinct.findLength("araaci", 2) == 4;
        assert LongestSubstringKDistinct.findLength("araaci", 1) == 2;
        assert LongestSubstringKDistinct.findLength("cbbebi", 3) == 5;
        assert LongestSubstringKDistinct.findLength("aabbcc", 1) == 2;
    }
}