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

    @Test
    public void numericComparisonAssertion() {
        Assert.That(3, Is.equalTo(3));
    }

    @Test
    public void numericComparisonAssertionWithTolerance() {
        Assert.That(391, Is.equalTo(390).withTolerance(5));
    }

    @Test
    public void doubleComparisonAssertion() {
        Assert.That(3.0d, Is.equalTo(3.1d).withTolerance(0.2d));
    }
}
