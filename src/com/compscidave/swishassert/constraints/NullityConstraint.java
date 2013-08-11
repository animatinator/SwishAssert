package com.compscidave.swishassert.constraints;


public class NullityConstraint extends Constraint {
    @Override
    protected boolean satisfiedBy(Object object) {
        return (object == null);
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
