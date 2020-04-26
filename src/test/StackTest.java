package test;

import main.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private Stack stack = new Stack();

    @Test
    public void testCase1() {
        stack.push(7);
        stack.push(4);
        stack.push(8);
        stack.push(6);

        assertEquals(6, stack.pop());
        assertEquals(8, stack.pop());
    }

}