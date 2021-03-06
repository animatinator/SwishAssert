package com.compscidave.swishassert.constraints.comparison;


public class GreaterThanConstraint extends ComparisonConstraint {
    public GreaterThanConstraint(Comparable other) {
        super(other);
    }

    @Override
    public boolean isSatisfiedBy(Comparable object) {
        return (object.compareTo(comparedObject) > 0);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("greater than '%s'", comparedObject);
    }
}
