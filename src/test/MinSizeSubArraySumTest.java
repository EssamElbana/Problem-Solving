package test;

import main.MinSizeSubArraySum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {

    @Test
    void findMinSubArray() {
        assert MinSizeSubArraySum.findMinSubArray(7, new int[]{
                2, 1, 5, 2, 8
        }) == 1;

        assert MinSizeSubArraySum.findMinSubArray(3, new int[]{
                1, 1
        }) == 0;
    }
}