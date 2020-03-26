package test;

import main.SelectionSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testCase1() {
        assertArrayEquals(
                new int[]{1, 1, 2, 3, 4, 7, 8, 9},
                selectionSort.solution(new int[]{9, 2, 3, 4, 1, 1, 8, 7}));
    }

}