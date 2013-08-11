package com.compscidave.swishassert.constraints;


import com.compscidave.swishassert.modifiers.BooleanModifier;
import com.compscidave.swishassert.modifiers.NoModifier;

public abstract class Constraint<T> {
    protected String failureMessage;
    private BooleanModifier modifier = new NoModifier();

    public boolean isSatisfiedBy(T object) {
        return modifier.modify(satisfiedBy(object));
    }
    protected abstract boolean satisfiedBy(T object);

    public Constraint withModifier(BooleanModifier modifier) {
        this.modifier = modifier;
        return this;
    }

    // Generate a failure message specific to the constraint, eg:
    // "Value should not have been equal to 'blah', but was"
    public abstract String generateFailureMessage(String userMessage);

    public Constraint withFailureMessage(String message) {
        failureMessage = message;
        return this;
    }
}
