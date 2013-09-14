package com.compscidave.swishassert.constraints.type;

import java.lang.reflect.Type;


public class InstanceOfConstraint extends TypeConstraint {
    public InstanceOfConstraint(Type type) {
        super(type);
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return ((Class<?>) type).isInstance(object);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("instance of %s", type);
    }
}
