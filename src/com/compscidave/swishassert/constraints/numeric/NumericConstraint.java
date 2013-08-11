package com.compscidave.swishassert.constraints.numeric;


import com.compscidave.swishassert.constraints.Constraint;

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
