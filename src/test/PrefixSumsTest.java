package test;

import main.PrefixSums;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrefixSumsTest {

    private PrefixSums prefixSums = new PrefixSums();
    private int[] a = new int[]{2, 2, 3, 6, 5, 6, 11, 8, 1, 20, 1, 33};

    @Test
    public void testCase1() {
        assertEquals(7, prefixSums.solution(a, 0, 2));
        assertEquals(40, prefixSums.solution(a, 6, 9));
    }

    @Test
    public void testCase2() {
        assertEquals(33, prefixSums.solution(a, 11, 11));
    }
}