package com.compscidave.swishassert.constraints.type;

import java.lang.reflect.Type;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 20/08/13
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
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
