package com.compscidave.swishassert.constraints;


public class EqualityConstraint extends Constraint<Object> {
    private Object otherObject;

    public EqualityConstraint(Object other) {
        otherObject = other;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return otherObject.equals(object);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("equal to '%s'", otherObject);
    }
}
