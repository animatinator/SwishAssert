package com.compscidave.swishassert.constraints;


public interface Constraint<T> {
    boolean satisfiedByObject(T object);
}
