package com.compscidave.swishassert.constraints;


public class EqualityConstraint implements Constraint<Object> {
    private Object otherObject;

    public EqualityConstraint(Object other) {
        otherObject = other;
    }

    @Override
    public boolean satisfiedByObject(Object object) {
        return otherObject.equals(object);
    }
}
