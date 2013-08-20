package com.compscidave.swishassert.constraints.type;

import java.lang.reflect.Type;


public class TypeEqualityConstraint extends TypeConstraint {
    public TypeEqualityConstraint(Type type) {
        super(type);
    }

    @Override
    public boolean isSatisfiedBy(Object other) {
        return other.getClass().equals(type);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("%s", type);
    }
}
