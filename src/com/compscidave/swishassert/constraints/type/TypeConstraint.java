package com.compscidave.swishassert.constraints.type;


import com.compscidave.swishassert.constraints.Constraint;

import java.lang.reflect.Type;

public abstract class TypeConstraint extends Constraint {
    protected Type type;

    public TypeConstraint(Type type) {
        this.type = type;
    }
}
