package com.compscidave.swishassert.constraints.bool;


public class TrueConstraint extends BooleanConstraint {
    @Override
    protected boolean satisfiedBy(Boolean object) {
        return object;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
