package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    public void testStackArray() {
        MyStack stack = new MyStack();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        Object one = stack.pop();
        assertEquals(one, 1);
    }

    public void testApp() {
        assertTrue(true);
    }
}