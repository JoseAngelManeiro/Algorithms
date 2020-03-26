package test;

import main.CountingSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountingSortTest {

    private CountingSort countingSort = new CountingSort();

    @Test
    public void testCase1() {
        assertArrayEquals(
                new int[]{1, 1, 2, 3, 4, 7, 8, 9},
                countingSort.solution(new int[]{9, 2, 3, 4, 1, 1, 8, 7}, 9));
    }

}