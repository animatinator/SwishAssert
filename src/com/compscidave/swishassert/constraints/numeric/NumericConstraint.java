package com.compscidave.swishassert.constraints.numeric;


import com.compscidave.swishassert.constraints.Constraint;

public abstract class NumericConstraint extends Constraint<Number> {
    protected Number number;

    public NumericConstraint(Number number) {
        this.number = number;
    }
}
