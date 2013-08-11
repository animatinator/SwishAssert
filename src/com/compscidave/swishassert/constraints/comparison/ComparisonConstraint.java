package com.compscidave.swishassert.constraints.comparison;


import com.compscidave.swishassert.constraints.Constraint;

public abstract class ComparisonConstraint implements Constraint<Comparable> {
    private Comparable comparedObject;

    public ComparisonConstraint(Comparable other) {
        comparedObject = other;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
