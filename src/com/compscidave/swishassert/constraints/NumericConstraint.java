package com.compscidave.swishassert.constraints;


public abstract class NumericConstraint implements Constraint<Number> {
    protected Number number;

    public NumericConstraint(Number number) {
        this.number = number;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException();
    }
}
