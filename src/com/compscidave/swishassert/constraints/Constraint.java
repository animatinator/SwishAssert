package com.compscidave.swishassert.constraints;


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
}
