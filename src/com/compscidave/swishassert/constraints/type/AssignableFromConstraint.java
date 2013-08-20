package com.compscidave.swishassert.constraints.type;

import java.lang.reflect.Type;


public class AssignableFromConstraint extends TypeConstraint {
    public AssignableFromConstraint(Type type) {
        super(type);
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return object.getClass().isAssignableFrom((Class<?>)type);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("assignable from %s", type);
    }
}
