package com.compscidave.swishassert.constraints.comparison;


import com.compscidave.swishassert.constraints.Constraint;

public abstract class ComparisonConstraint extends Constraint<Comparable> {
    protected Comparable comparedObject;

    public ComparisonConstraint(Comparable other) {
        comparedObject = other;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
