package test;

import main.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCase1() {
        assertEquals(4, solution.sum(2 ,2));
    }

}