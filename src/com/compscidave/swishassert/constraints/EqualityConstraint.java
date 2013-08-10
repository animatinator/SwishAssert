package com.compscidave.swishassert.constraints;


public class EqualityConstraint implements Constraint<Object> {
    private Object otherObject;

    public EqualityConstraint(Object other) {
        otherObject = other;
    }

    @Override
    public boolean satisfiedBy(Object object) {
        return otherObject.equals(object);
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException();
    }
}
