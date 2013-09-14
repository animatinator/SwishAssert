package com.compscidave.swishassert.test;


import com.compscidave.swishassert.Assert;
import com.compscidave.swishassert.Is;
import com.compscidave.swishassert.constraints.type.AssignableFromConstraint;
import com.compscidave.swishassert.constraints.type.TypeConstraint;
import org.junit.Test;

public class TypeConstraintTests {
    @Test
    public void ofTypePassesForCorrectType() {
        Assert.That(3, Is.sameTypeAs(0));
    }

    @Test
    public void ofTypeFailsForIncorrectType() {
        Assert.That(3, Is.not().sameTypeAs("Hello"));
    }

    @Test
    public void instanceOfPassesForInstance() {
        Assert.That(3, Is.instanceOf(Number.class));
    }

    @Test
    public void instanceOfFailsForNonInstance() {
        Assert.That("Hi", Is.not().instanceOf(Number.class));
    }

    @Test
    public void assignableFromPass() {
        Assert.That(3, Is.assignableFrom(Integer.class));
    }

    @Test
    public void assignableFromFail() {
        Assert.That(3, Is.assignableFrom(Number.class));
    }
}
