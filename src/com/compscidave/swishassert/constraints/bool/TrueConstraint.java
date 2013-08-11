package com.compscidave.swishassert.constraints.bool;


public class TrueConstraint extends BooleanConstraint {
    @Override
    public boolean isSatisfiedBy(Boolean object) {
        return object;
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
