package com.compscidave.swishassert.constraints;


public class NullityConstraint extends Constraint {
    @Override
    public boolean isSatisfiedBy(Object object) {
        return (object == null);
    }

    @Override
    public String generateFailureMessage() {
        return "null";
    }
}
