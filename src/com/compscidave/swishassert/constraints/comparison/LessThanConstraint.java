package com.compscidave.swishassert.constraints.comparison;


public class LessThanConstraint extends ComparisonConstraint {
    public LessThanConstraint(Comparable other) {
        super(other);
    }

    @Override
    protected boolean satisfiedBy(Comparable object) {
        return (object.compareTo(comparedObject) < 0);
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
