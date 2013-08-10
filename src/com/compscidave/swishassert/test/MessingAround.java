package com.compscidave.swishassert.test;

import com.compscidave.swishassert.Assert;
import com.compscidave.swishassert.Is;
import org.junit.Test;


public class MessingAround {
    @Test
    public void testTest() {
        assertEqualThings("Test", "Test");
    }

    public void assertEqualThings(Object obj1, Object obj2) {
        if (!obj1.equals(obj2)) {
            throw new AssertionError("Onoes! Expected: " + obj1.toString() + ", actual: " + obj2.toString());
        }
    }

    @Test
    public void tryASimpleEqualityAssertion() {
        Assert.That("Hello world", Is.equalTo("Hello world"), "Wasn't equal :(");
    }

    @Test
    public void tryASimpleFalseEqualityAssertion() {
        Assert.That("Hello world", Is.equalTo("Hello world!"), "Wasn't equal :(");
    }

    @Test
    public void tryASimpleFalseEqualityAssertionWithoutMessage() {
        Assert.That("Hello world", Is.equalTo("Hello worlds"));
    }
}
