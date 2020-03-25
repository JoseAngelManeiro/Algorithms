package test;

import main.CountCoincidences;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountCoincidencesTest {

    private CountCoincidences countCoincidences = new CountCoincidences();

    @Test
    public void testCase1() {
        assertArrayEquals(
                new int[]{2, 0, 1, 0, 2, 1},
                countCoincidences.sum(new int[]{0, 0, 4, 2, 4, 5} ,5));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(
                new int[]{0, 2, 1, 1, 4, 0, 0, 0, 0, 1},
                countCoincidences.sum(new int[]{1, 1, 2, 9, 4, 4, 4, 4, 3} ,9));
    }

}