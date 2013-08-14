package com.compscidave.swishassert.constraints;


public class NaNConstraint extends Constraint<Number> {
    @Override
    public boolean isSatisfiedBy(Number object) {
        // TODO: Implement NaNConstraint.satisfiedBy
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public String generateFailureMessage() {
        return "NaN";
    }
}
