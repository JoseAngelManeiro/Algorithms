package test;

import main.CountTotal;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountTotalTest {

    private CountTotal countTotal = new CountTotal();

    @Test
    public void testCase1() {
        assertEquals(55,
                countTotal.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

}