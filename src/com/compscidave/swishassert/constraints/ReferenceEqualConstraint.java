package com.compscidave.swishassert.constraints;


public class ReferenceEqualConstraint extends Constraint {
    private Object otherObject;

    public ReferenceEqualConstraint(Object otherObject) {
        this.otherObject = otherObject;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return (object == otherObject);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("referentially equal to %s", otherObject);
    }
}