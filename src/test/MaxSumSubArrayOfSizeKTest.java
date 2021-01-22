package test;

import main.MaxSumSubArrayOfSizeK;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSumSubArrayOfSizeKTest {


    @Test
    public void findMaxSumSubArrayTestWithKEqualTwo() {
        int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(
                2, new int[] { 2, 3, 4, 1, 5}
        );

        assert result == 7;
    }


    @Test
    public void findMaxSumSubArrayTestWithKEqualThree() {
        int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(
                3, new int[] { 2, 1, 5, 1, 3, 2}
        );

        assert result == 9;
    }
}