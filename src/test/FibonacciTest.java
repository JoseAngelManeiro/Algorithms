package test;

import main.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testCase1() {
        assertArrayEquals(
                new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89},
                fibonacci.solution(12));
    }

}