package com.compscidave.swishassert.constraints;


import com.compscidave.swishassert.modifiers.AndModifier;
import com.compscidave.swishassert.modifiers.OrModifier;

public abstract class Constraint<T> {
    protected String failureMessage;

    public abstract boolean isSatisfiedBy(T object);

    // Generate a failure message specific to the constraint, eg:
    // "Value should not have been equal to 'blah', but was"
    public abstract String generateFailureMessage(String userMessage);

    public Constraint withFailureMessage(String message) {
        failureMessage = message;
        return this;
    }


    public AndModifier and(Constraint other) {
        return new AndModifier(this, other);
    }

    public OrModifier or(Constraint other) {
        return new OrModifier(this, other);
    }
}
