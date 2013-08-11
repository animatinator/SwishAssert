package com.compscidave.swishassert.constraints;


public abstract class NumericConstraint implements Constraint<Number> {
    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException();
    }
}
