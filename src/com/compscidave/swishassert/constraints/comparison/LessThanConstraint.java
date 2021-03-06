package com.compscidave.swishassert.constraints.comparison;


public class LessThanConstraint extends ComparisonConstraint {
    public LessThanConstraint(Comparable other) {
        super(other);
    }

    @Override
    public boolean isSatisfiedBy(Comparable object) {
        return (object.compareTo(comparedObject) < 0);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("less than '%s'", comparedObject);
    }
}
