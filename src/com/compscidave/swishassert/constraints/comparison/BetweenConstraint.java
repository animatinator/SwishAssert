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
    protected boolean satisfiedBy(Comparable object) {
        return (object.compareTo(lowerBound) > 0 && object.compareTo(upperBound) < 0);
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
