package com.compscidave.swishassert.constraints.bool;


public class FalseConstraint extends BooleanConstraint {
    @Override
    protected boolean satisfiedBy(Boolean object) {
        return !object;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
