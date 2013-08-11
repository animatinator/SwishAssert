package com.compscidave.swishassert.constraints;


public class NaNConstraint extends Constraint<Number> {
    @Override
    protected boolean satisfiedBy(Number object) {
        // TODO: Implement NaNConstraint.satisfiedBy
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
