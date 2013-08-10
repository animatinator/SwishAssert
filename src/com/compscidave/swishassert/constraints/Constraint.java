package com.compscidave.swishassert.constraints;


public interface Constraint<T> {
    boolean satisfiedBy(T object);

    // Generate a failure message specific to the constraint, eg:
    // "Value should not have been equal to 'blah', but was"
    String generateFailureMessage(String userMessage);
}
