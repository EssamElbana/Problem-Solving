package test;


import org.junit.Test;
import static org.junit.Assert.*;

import static main.AverageOfAllContiguousSubArrays.findAverages;

public class AverageOfAllContiguousSubArraysTest {

    @Test
    public void testFindAverages() {
        double[] result = findAverages(5, new int[]{
                1, 3, 2, 6, -1, 4, 1, 8, 2
        });

        assertArrayEquals(result, new double[] {2.2, 2.8, 2.4, 3.6, 2.8},0);
    }
}