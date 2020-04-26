package test;

import main.Queue;
import org.junit.Test;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue = new Queue();

    @Test
    public void testCase1() {
        queue.push(4);
        queue.push(8);
        queue.push(6);

        assertEquals(4, queue.pop());
        assertEquals(8, queue.pop());

        assertEquals(1, queue.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testCase2() {
        queue.push(4);

        queue.pop();
        queue.pop();
    }
}