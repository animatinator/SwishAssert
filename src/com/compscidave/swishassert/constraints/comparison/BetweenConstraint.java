package com.compscidave.swishassert.constraints.comparison;

import com.compscidave.swishassert.constraints.Constraint;


public class BetweenConstraint extends Constraint<Comparable> {
    private final Comparable lowerBound;
    private final Comparable upperBound;

    public BetweenConstraint(Comparable lowerBound, Comparable upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean isSatisfiedBy(Comparable object) {
        return (object.compareTo(lowerBound) > 0 && object.compareTo(upperBound) < 0);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("between '%s' and '%s'", lowerBound, upperBound);
    }
}
