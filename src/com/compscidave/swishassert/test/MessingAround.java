package com.compscidave.swishassert.test;

import org.junit.Test;


public class MessingAround {
    @Test
    public void testTest() {
        assertEqualThings("Test", "Tesst");
    }

    public void assertEqualThings(Object obj1, Object obj2) {
        if (!obj1.equals(obj2)) {
            throw new AssertionError("Onoes! Expected: " + obj1.toString() + ", actual: " + obj2.toString());
        }
    }
}
