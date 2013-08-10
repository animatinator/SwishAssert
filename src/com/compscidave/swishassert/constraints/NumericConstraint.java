package com.compscidave.swishassert.constraints;


public abstract class NumericConstraint implements Constraint<Integer> {
    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException();
    }
}
